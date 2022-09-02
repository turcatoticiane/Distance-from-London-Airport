package com.turcato.ticiane.londonairportdistance.models;


import com.turcato.ticiane.londonairportdistance.proxy.Result;

/**
 *
 */
public class Postcode {


    private String postcode;
    private String region;
    private double longitude;
    private double latitude;

    /**
     * The default constructor
     */
    public Postcode() {
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
}
