/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: PublisherBase.java
 * Description: Methods to add/remove/notify subscribers
 */
package edu.bu.met.cs665;

/**
 * Interface publisher base 
 */
public interface PublisherBase {
    
    /**
     * Adds object to the list in the implementation
     * @param driver
     */
    void subscribe(Driver driver);

    /**
     * Removes object from the list in the implementation
     * @param driver
     */
    void unsubscribe(Driver driver);

    /**
     * Notifies all subscribers that exist in the list in implementation
     */
    void notifySubs();
}
