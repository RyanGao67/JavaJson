package com.shallowlightning;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TianUnitTest {
    @Test
    public void testBasic() throws JsonProcessingException {
        Car car = new Car();
        car.setColor("black");
        car.setType("Toyota");
        ObjectMapper m = new ObjectMapper();
        String myCarRepre = m.writeValueAsString(car);
        System.out.println(myCarRepre);
    }

    @Test
    public void testMap() throws JsonProcessingException {
        Map<Integer, Integer> map = new HashMap();map.put(1,1);map.put(2,1);
        Map<String, String> map1 = new HashMap();map1.put("a", "b");map1.put("c","b");
        T1 t1 = new T1("tgao",map, map1);
        ObjectMapper m = new ObjectMapper();
        String mymap = m.writeValueAsString(t1);
        System.out.println(mymap);
    }

    @Test
    public void testTypeEnumWithValue() throws JsonProcessingException {
        T2Enum t21 = T2Enum.T2Enum1;
        T2Enum t22 = T2Enum.T2Enum2;
        ObjectMapper m = new ObjectMapper();
        String reult  = m.writeValueAsString(t22);
        System.out.println(reult);
    }
}
