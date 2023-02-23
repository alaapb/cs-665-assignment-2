/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: DeliveryRequest.java
 * Description: Holds information about a delivery request
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.Store.Order;

/**
 * Delivery request class 
 * Holds the Order information tied to the delivery request
 */
public class DeliveryRequest {
    private Order order;


    /**
     * Initializes order
     * @param order
     * @param dist distributor for all the drivers to notify
     */
    public DeliveryRequest(Order order, Distributor dist) {
        this.order = order;
        dist.setDeliveryRequest(this);
    }

    /**
     * Returns the order this request associates with
     * @return
     */
    public Order getOrder() {
        return this.order;
    }
}
