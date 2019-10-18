package com.tableausoftware.documentation.api.rest;

import com.tableausoftware.documentation.api.rest.bindings.*;
import com.tableausoftware.documentation.api.rest.util.RestApiUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Test {

    private static Logger s_logger = Logger.getLogger(Test.class);

    private static Properties s_properties = new Properties();

    private static RestApiUtils s_restApiUtils;

    static {
        // Configures the logger to log to stdout
        BasicConfigurator.configure();

        // Loads the values from configuration file into the Properties instance
        try {
            s_properties.load(new FileInputStream("res/config.properties"));
        } catch (IOException e) {
            s_logger.error("Failed to load configuration files.");
        }
    }

    public static void main(String[] args) {
        // Sets the username, password, and content URL, which are all required
        // in the payload of a Sign In request
        String username = s_properties.getProperty("user.admin.name");
        String password = s_properties.getProperty("user.admin.password");
        String contentUrl = s_properties.getProperty("site.default.contentUrl");
        String projectName = s_properties.getProperty("site.project");
        String schema = s_properties.getProperty("server.schema.location");

        s_restApiUtils = RestApiUtils.getInstance(s_properties.getProperty("server.host"), 443, "default", schema);

        // Signs in to server and saves the authentication token, site ID, and current user ID
        TableauCredentialsType credential = s_restApiUtils.invokeSignIn(username, password, contentUrl);
        String currentSiteId = credential.getSite().getId();
        String currentUserId = credential.getUser().getId();

        s_logger.info(String.format("Authentication token: %s", credential.getToken()));
        s_logger.info(String.format("Site ID: %s", currentSiteId));

        // Queries the projects on the current site and iterates over the list to
        // find the ID of the default project
        ProjectType defaultProject = null;
        ProjectListType projects = s_restApiUtils.invokeQueryProjects(credential, currentSiteId);
        for (ProjectType project : projects.getProject()) {
            if (project.getName().equalsIgnoreCase(projectName)) {
                defaultProject = project;

                s_logger.info(String.format("Default project found: %s", defaultProject.getId()));
            }
        }

        // Ensure the default project was found before attempting to use it; if it was not found,
        // log the failure and exit gracefully
        if (defaultProject == null)
        {
            s_logger.error("Failed to find default project");

            // Signs out of the server. This invalidates the authentication token so
            // that it cannot be used for more requests.
            s_restApiUtils.invokeSignOut(credential);

            s_logger.info("Exiting without publishing due to previous failure");
            return;
        }

        // Gets the list of workbooks
        List<WorkbookType> currentUserWorkbooks = s_restApiUtils.invokeQueryWorkbooksForSite(credential, currentSiteId,
                null, null).getWorkbook();

        s_logger.info("SUCCESS");

        // Signs out of the server. This invalidates the authentication token so
        // that it cannot be used for more requests.
        s_restApiUtils.invokeSignOut(credential);
    }
}
