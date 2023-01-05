package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import org.testng.annotations.Test;

public class Day04_C01_ParallelTest  extends BaseCrossBrowserTest {
    @Test
    public void test01() {

        driver.get("https://www.google.com.tr/");
        System.out.println("test01 çalıştı");
    }
    @Test
    public void test02() {
        driver.get("https://www.amazon.com/");
        System.out.println("test02 çalıştı");
    }

    @Test
    public void test03() {
        driver.get("https://www.trendyol.com/");
        System.out.println("test03 çalıştı");
    }
}
