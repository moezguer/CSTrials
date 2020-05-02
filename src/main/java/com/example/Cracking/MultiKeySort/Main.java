package com.example.Cracking.MultiKeySort;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    @Test public void testMultiKeySort() {
        List<MultiKeySort.Employee> employees = new ArrayList<>();

        employees.add(new MultiKeySort.Employee("betula", "betul", "altay"));
        employees.add(new MultiKeySort.Employee("betula", "betul", "ozgur"));
        employees.add(new MultiKeySort.Employee("betula", "tilda", "ozgur"));
        employees.add(new MultiKeySort.Employee("beta", "betul", "altay"));

        Collections.sort(employees);

        employees.forEach(System.out::println);
    }
}
