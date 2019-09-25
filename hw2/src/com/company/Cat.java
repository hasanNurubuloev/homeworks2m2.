package com.company;

public class Cat extends Animal implements Printable {
    private int age ;


    public Cat(int age) {
        this.age = age;
        setName("Kuzya");
    }

    @Override
    public void print() {


        System.out.println(getName() + " " + getAge() + " years old");
    }
    public int getAge() {
        return age;
    }


}
