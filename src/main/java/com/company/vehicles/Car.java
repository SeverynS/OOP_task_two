package com.company.vehicles;

import com.company.details.Engine;
import com.company.proffesions.Driver;

public class Car {

    private String brand;
    private String comfortLevel;
    private int weight;
    private Driver driver;
    private Engine engine;

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void printInfo() {
        System.out.println("This amazing car brand is: " + this.brand + " comfort level: "  + this.comfortLevel
        + " weight: " + this.weight + " and engine: " + engine.getManufacturer() + " with power: "  + engine.getPower()
                + ". Driver is: " + driver.getFullName());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(String comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
