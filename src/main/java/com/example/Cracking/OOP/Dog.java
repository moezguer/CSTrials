package com.example.Cracking.OOP;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Dog extends Animal implements DayCalc{

    private String type;

    public Dog(Types name, int age, String type) {
        super(name, age);
        this.type = type;

    }

    static class Mammal {
        public void gettype() {
            System.out.println("mammal");
        }
    }

    @Override
    public void printName() {

        super.printName();
        System.out.println(getName() + " Doggy");
    }

    public void makeSound() {
        System.out.println("barkyyyyyy");
    }

    public void calculateDatys() {
        System.out.println(this.getAge()*360);
    }
}
