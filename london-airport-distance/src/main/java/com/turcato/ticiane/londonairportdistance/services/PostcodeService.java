package com.turcato.ticiane.londonairportdistance.services;

import com.turcato.ticiane.londonairportdistance.models.Postcode;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides methods to calculate distances between client postcode and London Heathrow airport
 */
@Service
public class PostcodeService {

    private final double AIRPORT_LONG = -0.4542955;
    private final double AIRPORT_LAT = 51.4700223;

    private List<Postcode> searchHistory = new ArrayList<>();

    /**
     * Constructor initializang the postcode list for tests and search history
     */
    public PostcodeService() {
        //postcodes just to test the history
        searchHistory.add(new Postcode("N7 6RS", "London", -0.116805, 51.560414, distance(51.560414, -0.116805), kilometersToMiles(distance(51.560414, -0.116805))));
        searchHistory.add(new Postcode("SW4 6TA", "London", -0.12278, 51.472716, distance(51.472716, -0.12278), kilometersToMiles(distance(51.472716, -0.12278))));
    }

    /**
     * Adds the postcode searched to the search history
     * @param postcode searched
     */
    public void addToSearchesHistory(Postcode postcode){

        if(searchHistory.size() == 3){
            searchHistory.remove(0);
            searchHistory.add(postcode);
            return;
        }
        searchHistory.add(postcode);
    }

    /**
     * Gets the search history of the postcodes
     * @return the search history
     */
    public List<Postcode> getSearchHistory() {
        return this.searchHistory;
    }

    /**
     * Calculates the distance between client and London Heathrow airport, using the Haversine Formula
     * (determines the great-circle distance between two points)
     * @param clientLat the client latitude
     * @param clientLong the client longitude
     * @return the distance in kilometers
     */
    public double distance(double clientLat, double clientLong){

        final int R = 6371; // Radious of the earth

        //The Haversine Formula

        Double latDistance = toRad(AIRPORT_LAT-clientLat);
        Double lonDistance = toRad(AIRPORT_LONG-clientLong);

        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) +
                Math.cos(toRad(clientLat)) * Math.cos(toRad(AIRPORT_LAT)) *
                        Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        Double distance = R * c;

        return (Math.round(distance*100.0)/100.0);
    }

    /**
     * Convert to radians
     * @param value to convert the latitude
     * @return radians
     */
    private Double toRad(Double value) {
        return value * Math.PI / 180;
    }

    /**
     * Converts the kilometers to miles
     * @param km the kilometer distance
     * @return the miles distance
     */
    public double kilometersToMiles(double km){

        return (Math.round(((km/1.609344)*100.0)/100.0));
    }

    /**
     * Converts the miles to kilometers
     * @param miles the miles distance
     * @return the kilometers distance
     */
    public double milesToKilometers(double miles){

        return (Math.round(((miles/0.6213712)*100.0)/100.0));
    }

}
