package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C02_DataProvider {//KENDİM YAZDIMMMMMM

    @Test(dataProvider ="getData")
    public void test(String username, String email, String password,int day){
        System.out.println("username"+username);
        System.out.println("username"+email);
        System.out.println("username"+password);
        System.out.println("username"+day);
    }
    @DataProvider
    public Object[][]getData(){
        Object[][]data={
                {"Nazlı","Karl","123",1},
                {"Ahmet","ahm","254",2},
                {"Murat","endy","253",3},
                {"Aslı","asli","253",4},
        };
        return data;
    }

}
