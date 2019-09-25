package com.company;

public class Mouse extends Animal implements Printable {
    private String size ;


    public Mouse(String size) {
        this.size = size;
        setName("Pushok");
    }

    @Override
    public void print() {


        System.out.println(getName() + "is very" + getSize());
    }
    public String getSize() {
        return size;
    }


}
