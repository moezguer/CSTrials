package com.example.Cracking.MultiKeySort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MultiKeySort {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Employee implements Comparable<Employee> {

        private String modifier;
        private String name;
        private String surname;

        @Override public int compareTo(Employee e2) {
            if (getSurname().compareTo(e2.getSurname()) != 0) {
                return getSurname().compareTo(e2.getSurname());
            } else if (getName().compareTo(e2.getName()) != 0) {
                return getName().compareTo(e2.getName());
            } else {
                return getModifier().compareTo(e2.getModifier());
            }
        }

    }
}
