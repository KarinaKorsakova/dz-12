package dataproviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "personData")
    public static Object[][] personData() {
        return new Object[][]{
                {"Ivan", "Ivanov", 70, true},
                {"Petro", "Petrenko", 65, true},
                {"Vasyl", "Vasylenko", 55, false}
        };
    }

    @DataProvider(name = "womanData")
    public static Object[][] womanData() {
        return new Object[][]{
                {"Anna", "Petrenko", 65, null, "Petrenko"},
                {"Olga", "Ivanenko", 65, null, "Ivanenko"},
                {"Julia", "Grigorenko", 70, null, "Grigorenko"}
        };
    }
}
