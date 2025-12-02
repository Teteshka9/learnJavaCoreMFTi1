package org.example;

public class Vehicle {
    int fuelCap;
    int mng;

    public int range() {
        return mng * fuelCap;
    }
}
