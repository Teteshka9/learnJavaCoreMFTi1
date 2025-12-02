package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {


    @ParameterizedTest
    @CsvSource({
            "10, 5, 50",
            "20, 4, 80",
            "15, 6, 90",
            "12, 5, 60",
            "8, 3, 24",
            "1, 2, 4"
    })


    void range(int fuelCap, int mng, int expected) {
        Vehicle vehicle = new Vehicle();

        vehicle.fuelCap = fuelCap;
        vehicle.mng = mng;

        int actual = vehicle.range();

        assertEquals(expected, actual);
    }
}