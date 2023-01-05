package clarusway.tests;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Day05_C02_ITestLisner implements ITestListener {
    @Test
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart ÇALIŞTI ");
    }


    @Test
    public void onTestSuccess(String s) {

    }

    @Test
    public void onTestFailure(String s) {
    }
}