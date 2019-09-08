package com.tableausoftware.documentation.api.rest.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Filter {

    String name;
    Operation oper;
    String value;

    public Filter(String name, Operation oper, String value) {
        this.name = name;
        this.oper = oper;
        this.value = value;
    }

    public enum Operation {
        EQ("eq"),
        GT("gt"),
        GTE("gte"),
        LT("lt"),
        LTE("lte"),
        IN("in"),
        HAS("has");

        private String value;

        Operation(String value) {
            this.value = value;
        }

        public String getOperation() {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Operation getOper() {
        return oper;
    }

    public void setOper(Operation oper) {
        this.oper = oper;
    }

    public String encodedValue() {
        String result;
        try {
            result = String.format("%s:%s:%s", URLEncoder.encode(name, StandardCharsets.UTF_8.toString()),
                    oper.getOperation(), URLEncoder.encode(value, StandardCharsets.UTF_8.toString()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
