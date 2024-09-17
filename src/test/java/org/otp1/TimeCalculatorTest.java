package org.otp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeCalculatorTest {

    @Test
    public void testCalculate() {
        TimeCalculator calculator = new TimeCalculator();
        assertEquals(2.0, calculator.calculateTime(100.0, 50.0), 0.0001);
    }

}