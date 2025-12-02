package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SumNumTest {

    /* ЕСЛИ В ОСНОВНОМ КЛАССЕ МЕТОД INT SUM (INT A, INT B)  ТО НАДО СОЗДАТЬ ЭКЗЕМПЛЯР
    ИЛИ НАДО ПРИСВОИТЬ PUBLIC STATIC INT SUM (INT A, INT B) ТОГДА МОЖНО БЕЗ ЭКЗЕМЛЯРА НАПРЯМУЮ
     */

    @ParameterizedTest
    @CsvSource({
            "2, 8, 10",
            "0, 10, 10",
            "10, 0, 10",
            "9, 1, 10",
            "1, 9, 10"
    })
    void validNumSum(int a, int b, int expectedSum) {
        SumNum calculator = new SumNum();
        assertEquals(expectedSum, calculator.sum(a, b));
    }
}