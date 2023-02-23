package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.Store.Order;
import edu.bu.met.cs665.Store.Shop;

public class TestDeliveryRequest {
    
    @Test
    public void testDeliveryRequestNotifForDrivers() {
        Distributor dist = new Distributor();

        Driver driver = new Driver("taxi", "phil", dist);
        Driver driver2 = new Driver("van", "alex", dist);
        Driver driver3 = new Driver("scooter", "max", dist);
        Driver driver4 = new Driver("taxi", "adrian", dist);

        Shop shop = new Shop("popeyes");
        
        Order order = new Order(shop, "chicken tenders", 4);

        DeliveryRequest request = new DeliveryRequest(order, dist);

        assertEquals(request, driver.getLatestRequest());
        assertEquals(request, driver2.getLatestRequest());
        assertEquals(request, driver3.getLatestRequest());
        assertEquals(request, driver4.getLatestRequest());

    }
}
