package com.tableausoftware.documentation.api.rest.util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterCollection {
    private Collection<Filter> coll = new ArrayList<Filter>() {
    };

    public FilterCollection add(Filter filter) {
        coll.add(filter);
        return this;
    }

    public String collectEncodedValue() {
        return coll.stream().map(x -> x.encodedValue()).collect(Collectors.joining( "," ));
    }
}
