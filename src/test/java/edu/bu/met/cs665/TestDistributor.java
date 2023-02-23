package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDistributor {
    

    @Test
    public void testSubscription() {
        Driver driver = new Driver("taxi", "alex");

        Distributor dist = new Distributor();

        dist.subscribe(driver);

        assertEquals(true, dist.getDrivers().contains(driver));
    }

    @Test
    public void testUnSubscription() {
        Driver driver = new Driver("taxi", "alex");

        Distributor dist = new Distributor();

        dist.subscribe(driver);
        dist.unsubscribe(driver);

        assertEquals(false, dist.getDrivers().contains(driver));
    }
}
