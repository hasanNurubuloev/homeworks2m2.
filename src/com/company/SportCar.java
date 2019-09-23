package com.company;
public final class SportCar extends Car implements Cloneable{

    private int year;
    private String mark;
    private int mileage;
    Car car;

    public SportCar(Car car,int year,String mark,int mileage ) {
        this.car = car;
        this.year = year;
        this.mark = mark;
        this.mileage =mileage;
    }

    public SportCar(String sportCar, int year, String mark, int mileage) {
        super();
    }

    @Override
    public String toString() {
        return this.mileage + "{"+
                "mark=" + mark+
                ", car=" + car+
                ", year=" +year+
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
 public  void characteristicsCar (int year , String mark, int mileage) {
    System.out.println("Sport car characteristics: " + year  + " "+ mark  + " " + mileage);

}

}