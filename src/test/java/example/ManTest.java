package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ManTest {

    @DataProvider(name = "manDataProvider")
    public Object[][] manDataProvider() {
        return new Object[][] {
                {"Ivan", "Ivanov", 70, true},
                {"Petro", "Petrenko", 65, true},
                {"Vasyl", "Vasylenko", 55, false}
        };
    }

    @Test(dataProvider = "manDataProvider")
    public void testIsRetired(String firstName, String lastName, int age, boolean expectedRetired) {
        Man man = new Man(firstName, lastName, age);
        assertEquals(man.isRetired(), expectedRetired);
    }
}
