package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDriver {
    
    @Test
    public void testDriverName() {
        Distributor dist = new Distributor();

        Driver new_driver = new Driver("taxi", "alex", dist);

        assertEquals("alex", new_driver.getName());
    }

    @Test
    public void testDriverType() {
        Distributor dist = new Distributor();

        Driver new_driver = new Driver("taxi", "alex", dist);

        assertEquals("taxi", new_driver.getType());
    }

    @Test
    public void testDriverList() {
        Distributor dist = new Distributor();

        Driver new_driver = new Driver("taxi", "alex", dist);

        boolean contains = dist.getDrivers().contains(new_driver);

        assertEquals(true, contains);
    }
}
