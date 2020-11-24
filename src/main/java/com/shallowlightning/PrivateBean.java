package com.shallowlightning;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PrivateBean {
    private int id;
    private String name;

    public PrivateBean() {

    }

    public PrivateBean(final int id, final String name) {
        this.id = id;
        this.name = name;
    }
}

