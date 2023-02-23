/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Distributor.java
 * Description: Holds all the drivers
 */

package edu.bu.met.cs665;

import java.util.ArrayList;

/**
 * Distributor class
 * Extends from publisher base
 */
public class Distributor implements PublisherBase{
    private ArrayList<Driver> drivers;

    private DeliveryRequest curRequest;

    /**
     * Initializes list of drivers
     */
    public Distributor() {
        drivers = new ArrayList<>();
    }

    /**
     * Returns list of drivers
     * @return
     */
    public ArrayList<Driver> getDrivers() {
        return this.drivers;
    }

    /**
     * Sets current delivery request, and then drivers are notified of a new delivery request
     * @param deliveryRequest
     */
    public void setDeliveryRequest(DeliveryRequest deliveryRequest) {
        this.curRequest = deliveryRequest;
        this.notifySubs();
    }

    @Override
    public void subscribe(Driver driver) {
        drivers.add(driver);
    }

    @Override
    public void unsubscribe(Driver driver) {
        drivers.remove(driver);
    }

    @Override
    public void notifySubs() {
        for(Driver driver : drivers) {
            driver.updateSelf(this.curRequest);
        }
    }
}
