/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Driver.java
 * Description: Holds information about a driver
 */

package edu.bu.met.cs665;

/**
 * Driver class
 * Implementing the subscriber base which can then add drivers to the existing list in the distributor
 */
public class Driver implements SubscriberBase {
    private String driverType;
    private String driverName;
    private Distributor dist;
    private DeliveryRequest updatedRequest;

    /**
     * Initializes without the distributor
     * Used for testing
     * @param driverType
     * @param driverName
     */
    public Driver(String driverType, String driverName) {
        this.driverType = driverType;
        this.driverName = driverName;
        this.updatedRequest = null;
        this.dist = null;
    }

    /**
     * Initializes with the distributor
     * A subscribe call is made to add the driver to the existing drivers already created
     * @param driverType
     * @param driverName
     * @param dist
     */
    public Driver(String driverType, String driverName, Distributor dist) {
        this.driverType = driverType;
        this.driverName = driverName;
        this.dist = dist;
        this.updatedRequest = null;
        this.dist.subscribe(this);
    }

    /**
     * Returns driver name
     * @return
     */
    public String getName() {
        return driverName;
    }

    /**
     * Returns driver type (taxi, van, scooter)
     * @return
     */
    public String getType() {
        return driverType;
    }

    /**
     * Return latest delivery request 
     * @return
     */
    public DeliveryRequest getLatestRequest() {
        return updatedRequest;
    }

    @Override
    public void updateSelf(DeliveryRequest deliveryRequest) {
        this.updatedRequest = deliveryRequest;

        System.out.println(this.getName() + " received the delivery request (" + this.getType() + ") for " + this.updatedRequest.getOrder().getProductName() + " from " + this.updatedRequest.getOrder().getShop().getShopName());

    }

}
