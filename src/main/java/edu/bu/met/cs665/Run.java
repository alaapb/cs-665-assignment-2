package edu.bu.met.cs665;

import edu.bu.met.cs665.Store.Order;
import edu.bu.met.cs665.Store.Shop;

public class Run {
    

    // Using to test application
    public Run() {
        Distributor dist = new Distributor();
        // create drivers here
        Driver driver1 = new Driver("taxi", "alex", dist);
        Driver driver2 = new Driver("scooter", "phil", dist);
        Driver driver3 = new Driver("van", "ted", dist);
        Driver driver4 = new Driver("taxi", "justin", dist);

        Shop shop = new Shop("popeyes");
        Shop shop2 = new Shop("mcdonalds");

        Order first_order = new Order(shop, "chicken sandwhich", 3);

        DeliveryRequest request = new DeliveryRequest(first_order, dist);



    }
}
