package com.singgih.iteratorpattern;

/**
 * Created by singgihrs on 4/25/17.
 */
public class VehicleItem {

    String name;

    String type;

    String brand;

    public VehicleItem(String name, String type, String brand) {
        this.name = name;
        this.type = type;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
