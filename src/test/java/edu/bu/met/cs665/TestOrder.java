package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.Store.Order;
import edu.bu.met.cs665.Store.Shop;

public class TestOrder {
    
    @Test
    public void testGetShop() {
        Shop shop = new Shop("popeyes");
        Order order = new Order(shop, "chicken sandwhich", 0);
        assertEquals(shop, order.getShop());
    }

    @Test
    public void testGetProduct() {
        Shop shop = new Shop("popeyes");
        Order order = new Order(shop, "chicken sandwhich", 0);
        assertEquals("chicken sandwhich", order.getProductName());
    }

    @Test
    public void testGetOrderNum() {
        Shop shop = new Shop("popeyes");
        Order order = new Order(shop, "chicken sandwhich", 0);
        assertEquals(0, order.getOrderNum());
    }
}
