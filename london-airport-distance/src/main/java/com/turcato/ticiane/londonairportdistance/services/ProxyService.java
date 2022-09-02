package com.turcato.ticiane.londonairportdistance.services;

import com.turcato.ticiane.londonairportdistance.models.Postcode;
import com.turcato.ticiane.londonairportdistance.proxy.Root;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Provides methods to get information for postcode.io API
 */
@Service
public class ProxyService {

    private final String api = "https://api.postcodes.io/postcodes/";

    /**
     * Validates the client postcode
     * @param postcode to validate
     * @return boolean
     */
    public boolean validatePostcode(String postcode) {

        String uri = api + postcode + "/validate";
        RestTemplate restTemplate = new RestTemplate();
        Root root = restTemplate.getForObject(uri, Root.class);

        return root.getResult().isResult();
    }

    /**
     * Gets the postcode information
     * @param postcode to get the information
     * @return information in json format
     */
    public Postcode findPostcode(String postcode) {

        String uri = api + postcode;
        RestTemplate restTemplate = new RestTemplate();
        Root root = restTemplate.getForObject(uri, Root.class);

        Postcode clientPostcode = new Postcode(root.getResult());

        return clientPostcode;
    }

}
