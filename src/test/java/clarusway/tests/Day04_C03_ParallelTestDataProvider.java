package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day04_C03_ParallelTestDataProvider {

    @Test(dataProvider ="getData")
    public void test(String name,String surname) {

        System.out.println("name "+name+"surname "+surname + Thread.currentThread().getName());
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"yusuf","uçtu"},
                {"mert","mat"},
                {"nazan","naz"}
        };

    }
}