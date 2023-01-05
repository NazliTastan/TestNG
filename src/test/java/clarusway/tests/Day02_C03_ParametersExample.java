package clarusway.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day02_C03_ParametersExample {

    String driver;

    @BeforeMethod
    public void setUp(String browserName) {
        //Driver konfigurasyonları yapılır
        if(browserName.equals("chrome")){
            //chrome conf yapıldı
            driver = "chrome";

        }else if(browserName.equals("firefox")){
            driver = "firefox";
            //opera conf kyapıldı.
        } else if (browserName.equals("opera")) {
            //opera conf yapıldı
            driver="opera";
        }
    }

    @AfterMethod
    public void tearDown() {
        //driver kapatılıyor
    }
    @Test
    public void test(){
        System.out.println("Test execution başladı");
        System.out.println("Test kullanılan driver "+driver);
        //testimiz gercekleşiyor
    }

}