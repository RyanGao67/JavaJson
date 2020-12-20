package com.shallowlightning;

import com.fasterxml.jackson.annotation.JsonValue;

public enum T2Enum {
    T2Enum1("a", "b"), T2Enum2("c", "d");

    private String v1;

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    @JsonValue
    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    private String v2;

    private T2Enum(String v1, String v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    private T2Enum(){}


}
