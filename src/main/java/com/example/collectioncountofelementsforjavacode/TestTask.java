package com.example.collectioncountofelementsforjavacode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestTask {
    public static Map<Integer, Integer> numberOfIdenticalElements(List<Integer> list) {
        Map<Integer, Integer> result = new HashMap<>();
        for(Integer count : list){
            if(!result.containsKey(count)){
                result.put(count, 1);
            }else{
                result.put(count, result.get(count) + 1);
            }
        }
        return result;
    }
}
