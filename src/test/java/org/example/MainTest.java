package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/home/gustavo07/IdeaProjects/Calculator/drivers/geckodriver");

    }
    @After
    public void tearDown() {

    }
    @Test
    public void test01(){
        String firstValue = "10";
        String secondValue = "50";

        String expectedResult = "5"; // Valor esperado

        String result = Main.calculate(firstValue, secondValue);
        assertEquals(result, expectedResult);
    }

    @Test
    public void test02(){
        String firstValue = "5";
        String secondValue = "50";

        String expectedResult = "2.5"; // Valor esperado

        String result = Main.calculate(firstValue, secondValue);
        assertEquals(result, expectedResult);
    }
    @Test
    public void test03(){
        String firstValue = "10";
        String secondValue = "150";

        String expectedResult = "7"; // Valor esperado

        String result = Main.calculate(firstValue, secondValue);
        assertEquals(result, expectedResult);
    }
}