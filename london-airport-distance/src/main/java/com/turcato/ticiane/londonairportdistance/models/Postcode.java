package com.turcato.ticiane.londonairportdistance.models;


import com.turcato.ticiane.londonairportdistance.proxy.Result;
import com.turcato.ticiane.londonairportdistance.services.PostcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class Postcode {


    private String postcode;
    private String region;
    private double longitude;
    private double latitude;
    private double distanceInKm;
    private double distanceInMiles;


    //@Autowired
    //private PostcodeService service;
    /**
     * The default constructor
     */
    public Postcode() {
    }

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

    /*private double airportDistance(){
        return service.distance(this.latitude, this.longitude);
    }*/

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getDistanceInMiles() {
        return distanceInMiles;
    }

    public void setDistanceInMiles(double milesDistance) {
        this.distanceInMiles = milesDistance;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(double kmDistance) {
        this.distanceInKm = kmDistance;
    }
}
