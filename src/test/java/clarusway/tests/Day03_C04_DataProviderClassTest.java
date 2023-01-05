package clarusway.tests;

import org.testng.annotations.Test;

public class Day03_C04_DataProviderClassTest {
    @Test(
            dataProvider ="testData",
            dataProviderClass=Day03_C03_DataProviderClass.class
    )
    public void dataProviderTest(String English,String Turkish){
        System.out.println(English);
        System.out.println(Turkish);
    }

}
