package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.Store.Shop;

public class TestShop {
    
    @Test
    public void testGetShopName() {
        Shop shop = new Shop("popeyes");
        assertEquals("popeyes", shop.getShopName());
    }
}
