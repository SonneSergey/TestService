package ru.netology.test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class TestServiceTest {

    @Test
    void findMax() {
        TestService service = new TestService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
