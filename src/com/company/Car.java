package com.company;

import java.awt.*;

public class Car extends Vehical {



    public void characteristicsCar(int year, String mark) {
        System.out.println(year + " " + mark);
    }


    public void characteristicsCar(int year, String mark, int mileage) {
        System.out.println(year + " " + mark + " " + mileage);
    }

    public final void characteristicsCar(int year, String mark, int mileage, Color color) {
        System.out.println(year + " " + mark + " " + mileage + " " + color);
    }
}
