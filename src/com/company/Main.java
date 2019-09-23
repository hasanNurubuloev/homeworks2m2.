package com.company;

import java.awt.*;

// Основное
//Доделать все пункты практического задания по презентации
//Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии), последний 3й класс сделать не наследуемым
//Все поля классов должны быть приватными, одно из полей должно быть сложного типа созданного вами же (4й класс), одно из полей сделать сложного типа (enum)
//В классах не должно быть setter-ов, только getter-ы и конструкторы
//Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать неперезаписываемым
//В классе 3-го уровня перезаписать один из методов родителя
//В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го уровня (objectB, objectC), также распечатать все свойства объектов и вызвать перегруженные методы через каждый из экземпляров ваших объектов.
//На сообразительность
//Написать метод в классе 3-го уровня который бы копировал некоторые свойства из себеподобного объекта
//Затем скопировать несколько свойств из objectB в objectC и распечатать информацию по objectC
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

    Car car = new Car() ;
    car.characteristicsCar(2014, "BMW");
    car.characteristicsCar(2013, "MERS", 45544);
    car.characteristicsCar(2013, "MERS", 14522, Color.BLACK);
    SportCar sp1 = new SportCar("Subaru",2015,"Forester",45544) ;
    SportCar clone = (SportCar) sp1.clone();
    System.out.println(sp1);
    System.out.println(clone);
    System.out.println(clone);
    sp1.characteristicsCar(2015, "Honda");
    sp1.characteristicsCar(2016, "Toyota", 50546);
    sp1.characteristicsCar(2016, "Toyota", 50546, Color.WHITE);
    SportCar sp2 = new SportCar("Mustang",2016,"Ford",45363) ;
    SportCar clone2 = (SportCar) sp2.clone();
    System.out.println(sp1);
    System.out.println(clone2);
    clone.car.characteristicsCar(2015,"AUDI");
    System.out.println(clone);
    sp2.characteristicsCar(2017, "KIA" );
    sp2.characteristicsCar(2018, "AUDI", 35412);
    sp2.characteristicsCar(2018, "AUDI", 35412, Color.GREEN);
    }
}
