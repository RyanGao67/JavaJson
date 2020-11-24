package com.shallowlightning;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

public class User {
    public int id;
    public Name name;

    @JsonIgnoreType
    public static class Name {
        public String firstName;
        public String lastName;
    }
}
