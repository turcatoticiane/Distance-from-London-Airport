package com.turcato.ticiane.londonairportdistance.services;

import com.turcato.ticiane.londonairportdistance.models.Postcode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class PostcodeServiceTest {

    private PostcodeService postcodeService;
    private List<Postcode> list = new ArrayList<>();

    @Before
    public void setup(){

        postcodeService = new PostcodeService();
        list.add(new Postcode("N7 6RS", "London", -0.116805, 51.560414, postcodeService.distance(51.560414, -0.116805), postcodeService.kilometersToMiles(postcodeService.distance(51.560414, -0.116805))));
        list.add(new Postcode("SW4 6TA", "London", -0.12278, 51.472716, postcodeService.distance(51.472716, -0.12278), postcodeService.kilometersToMiles(postcodeService.distance(51.472716, -0.12278))));
    }

    @Test
    public void testAddToSearchHistory() {

        postcodeService.addToSearchesHistory(new Postcode("N7 6RS", "London", -0.116805, 51.560414, postcodeService.distance(51.560414, -0.116805), postcodeService.kilometersToMiles(postcodeService.distance(51.560414, -0.116805))));
        int size = postcodeService.getSearchHistory().size();

        Assert.assertEquals(3, size);
    }

    @Test
    public void testGetSearchHistory() {

        int size = postcodeService.getSearchHistory().size();

        Assert.assertEquals(2, size);
    }

    @Test
    public void testDistance() {

        double distance = postcodeService.distance(51.560414, -0.116805);
        Assert.assertEquals(25.49, distance, 25.42);
    }

    @Test
    public void testKmToMiles() {

        double miles = postcodeService.kilometersToMiles(1);
        Assert.assertEquals(0.62, miles, 0.65);
    }

    @Test
    public void testMilesToKm() {

        double km = postcodeService.milesToKilometers(1);
        Assert.assertEquals(1.61, km, 1.60);
    }

}
