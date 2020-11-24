package com.shallowlightning;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class RawBean {
    public String name;
    @JsonRawValue
    public String json;
    //final RawBean bean = new RawBean("My bean", "{\"attr\":false}");
    //final String result = new ObjectMapper().writeValueAsString(bean);
    // if we do not add jsonrawvalue, the serialized string will be like:
    // {"name":"My bean","json":"{\"attr\":false}"}
    // instead of
    // {"name":"My bean","json":{"attr":false}}

    public RawBean() {}
    public RawBean(final String name, final String json) {this.name = name;this.json = json;}

}
