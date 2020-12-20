package com.shallowlightning;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Map;

public class T1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonAnyGetter
    public Map<Integer, Integer> getM1() {
        return m1;
    }

    public void setM1(Map<Integer, Integer> m1) {
        this.m1 = m1;
    }

    @JsonGetter("M2Alias")
    public Map<String, String> getM2() {
        return m2;
    }

    public void setM2(Map<String, String> m2) {
        this.m2 = m2;
    }

    public T1(String name, Map<Integer, Integer> m1, Map<String, String> m2) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "T1{" +
                "name='" + name + '\'' +
                ", m1=" + m1 +
                ", m2=" + m2 +
                '}';
    }

    private Map<Integer, Integer> m1;
    private Map<String, String> m2;

}
