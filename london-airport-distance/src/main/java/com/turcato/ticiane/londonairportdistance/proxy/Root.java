package com.turcato.ticiane.londonairportdistance.proxy;

/**
 * The Root from the json returned by the postcode.io API
 */
public class Root {

    private int status;
    private Result result;

    /**
     * Gets the status of the http request from the postcodes.io API
     * @return the request status from the postcodes.io API
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the status of the http request from the postcodes.io API
     * @param status of the request
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Gets the result of the request from the postcodes.io API
     * @return the result request
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the result of the request from the postcodes.io API
     * @param result of the postcode searched
     */
    public void setResult(Result result) {
        this.result = result;
    }
}
