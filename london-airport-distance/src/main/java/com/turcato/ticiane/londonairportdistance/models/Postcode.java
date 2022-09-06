package com.turcato.ticiane.londonairportdistance.models;


import com.turcato.ticiane.londonairportdistance.proxy.Result;
import org.springframework.stereotype.Component;

/**
 * The Postcode component
 */
@Component
public class Postcode {


    private String postcode;
    private String region;
    private double longitude;
    private double latitude;
    private double distanceInKm;
    private double distanceInMiles;

    /**
     * The default constructor
     */
    public Postcode() {
    }

    /**
     * Constructor to help the tests
     * @param postcode      postcode searched
     * @param region        of the postcode
     * @param longitude     of the postcode
     * @param latitude      of the postcode
     * @param kmDistance    of the postcode to London Airport
     * @param milesDistance of the postcode to London Aiport
     */
    public Postcode(String postcode, String region, double longitude, double latitude, double kmDistance, double milesDistance) {
        this.postcode = postcode;
        this.region = region;
        this.longitude = longitude;
        this.latitude = latitude;
        this.distanceInKm = kmDistance;
        this.distanceInMiles = milesDistance;
    }

    /**
     * Constructor to transform the json result in information that we need
     * @param result json
     */
    public Postcode(Result result) {
        this.postcode = result.getPostcode();
        this.region = result.getRegion();
        this.longitude = result.getLongitude();
        this.latitude = result.getLatitude();
    }

    /**
     * Gets the postcode searched
     * @return the postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the postcode
     * @param postcode the postcode searched
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Gets the postcode region
     * @return the postcode region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the postcode regons
     * @param region of the postcode
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets the postcode longitude
     * @return the postcode longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the postcode longitude
     * @param longitude of the postcode
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Gets the postcode latitude
     * @return the postcode longitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets  the postcode latitude
     * @param latitude of the postcode
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets postcode distance for London Airport in Miles
     * @return the postcode distance for London Airport in Miles
     */
    public double getDistanceInMiles() {
        return distanceInMiles;
    }

    /**
     * Sets postcode distance for London Airport in Miles
     * @param milesDistance the postcode distance from the Airport
     */
    public void setDistanceInMiles(double milesDistance) {
        this.distanceInMiles = milesDistance;
    }

    /**
     * Gets postcode distance for London Airport in Kilometers
     * @return the postcode distance for London Airport in kilometers
     */
    public double getDistanceInKm() {
        return distanceInKm;
    }

    /**
     * Sets postcode distance for London Airport in Kilometers
     * @param kmDistance the postcode distance from the Airport
     */
    public void setDistanceInKm(double kmDistance) {
        this.distanceInKm = kmDistance;
    }
}
