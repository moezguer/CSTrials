package com.example.Cracking.OOP;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
abstract class Animal {

    private Types name;
    private int age;




    public void printName() {
        System.out.println(getName());
    }

    abstract void makeSound();
}
