package com.company;
public final class SportCar extends Car {
@Override
public  void characteristicsCar (int year , String mark, int mileage) {
    System.out.println("Sport car characteristics: " + year  + " "+ mark  + " " + mileage);
}
}
