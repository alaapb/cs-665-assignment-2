/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: SubscriberBase.java
 * Description: Interface for method to update 
 */
package edu.bu.met.cs665;

/**
 * Subscriber interface
 */
public interface SubscriberBase {
    
    /**
     * Updates the subscriber object with the delivery request sent
     * @param deliveryRequest
     */
    void updateSelf(DeliveryRequest deliveryRequest);
}
