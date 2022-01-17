package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldSQRClStandardLimit() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.countSqrCalc(200,300);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'standard range', 100, 300, 8",
            "'huge range', 0, 10000000,90",
            "'zero range',0,0,0",
            "'negative range', -300, -100,0",
            "'negative&positive range', -300, 300, 8"})
    public void shouldSQRService(String testName, int lowLim, int highLim, int expected) {
        SQRService service = new SQRService();
        int actual = service.countSqrCalc(lowLim, highLim);
        assertEquals(expected, actual);
    }
}