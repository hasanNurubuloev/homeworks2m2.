package com.company;

public class Dog extends Animal implements Printable {


    private String makeVoice ;

    public Dog(String makeVoice) {
        setName("Rex");

        this.makeVoice = makeVoice;
    }

    @Override
    public void print() {
        System.out.println(getName() + "'s voice is " + getMakeVoice() );
    }

    public String getMakeVoice() {
        return makeVoice;
    }


    }