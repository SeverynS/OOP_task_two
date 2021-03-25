package com.company;
/*
* 2 задание
===========

* Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете
* com.company.professions. Класс Driver содержит поля - ФИО, стаж вождения.
* Класс Engine содержит поля - мощность, производитель.
* Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
* Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся",
* "Поворот направо" или "Поворот налево". А также метод printInfo(), который выводит полную информацию об автомобиле,
* ее водителе и моторе.
*
* */

import com.company.details.Engine;
import com.company.proffesions.Driver;
import com.company.vehicles.Car;

public class Start {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Engine engine = new Engine();
        Car car = new Car();

        driver.setFullName("Onotole");
        driver.setDrivingExperience(100500);
        engine.setManufacturer("LAZ");
        engine.setPower(500);
        car.setBrand("Maserati");
        car.setComfortLevel("Luxury");
        car.setWeight(2000);
        car.setDriver(driver); 
        car.setEngine(engine);

        car.start();
        car.stop();
        car.printInfo();
    }
}
