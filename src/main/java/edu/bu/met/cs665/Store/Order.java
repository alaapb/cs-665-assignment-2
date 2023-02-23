/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Order.java
 * Description: This class is responsible for the details of the order, such as the Shop it is from, product, and order number
 */
package edu.bu.met.cs665.Store;


/**
 * This is the Order class
 * Holds all the information about an Order
 */
public class Order {
    private Shop shop;
    private String product;
    private Integer orderNum;

    /**
     * Initialize all variables
     * @param shop
     * @param productName
     * @param orderNum
     */
    public Order(Shop shop, String productName, int orderNum) {
        this.shop = shop;
        this.product = productName;
        this.orderNum = orderNum;

    }

    /**
     * Returns the Shop object associated with this order
     * @return shop information
     */
    public Shop getShop() {
        return this.shop;
    }

    /**
     * Returns the product name of this particular order
     * @return product name string
     */
    public String getProductName() {
        return this.product;
    }

    /**
     * Returns the order number 
     * @return order number int
     */
    public int getOrderNum() {
        return this.orderNum;
    }
}
