package com.example.collectioncountofelementsforjavacode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CollectionCountOfElementsForJavaCodeApplicationTests {

    @Test
    void Test() {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1,1,1,2,2,3,4);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,3);
        map.put(2,2);
        map.put(3,1);
        map.put(4,1);
        assertTrue(TestTask.numberOfIdenticalElements(list).equals(map));




    }

}
