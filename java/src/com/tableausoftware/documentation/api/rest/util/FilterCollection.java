package com.tableausoftware.documentation.api.rest.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class FilterCollection {
    private Collection<Filter> coll = new ArrayList<Filter>() {
    };

    public FilterCollection add(Filter filter) {
        coll.add(filter);
        return this;
    }

    public String collectEncodedValue() {
        String tmp = coll.stream().map(x -> x.encodedValue()).collect(Collectors.joining( "," ));
        return coll.stream().map(x -> x.encodedValue()).collect(Collectors.joining( ",", "", "" ));
    }
}
