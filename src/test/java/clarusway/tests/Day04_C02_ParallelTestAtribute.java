package clarusway.tests;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAtribute {

    @Test(  threadPoolSize = 2,     //testin kaç çekirdekte paralel olarak calısacağını belirler
            invocationCount = 4     //testin kaç defa calıştırılacağıı belirler
    )
    public void test() {
        System.out.println("Current thread Id"+Thread.currentThread().getId());

    }
}
