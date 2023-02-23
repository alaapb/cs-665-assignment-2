/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Shop.java
 * Description: Holds shop information
 */
package edu.bu.met.cs665.Store;

/**
 * Shop class holds information about the Shop
 */
public class Shop {
    
    private String shopName;

    /**
     * Initializes the shop name
     * @param shopName
     */
    public Shop(String shopName) {
        this.shopName = shopName;
    }

    /**
     * Returns the shop name
     * @return shop name
     */
    public String getShopName() {
        return shopName;
    }

}
