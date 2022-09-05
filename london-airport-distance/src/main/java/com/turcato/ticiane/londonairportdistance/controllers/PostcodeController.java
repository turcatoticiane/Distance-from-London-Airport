package com.turcato.ticiane.londonairportdistance.controllers;

import com.turcato.ticiane.londonairportdistance.models.Postcode;
import com.turcato.ticiane.londonairportdistance.services.PostcodeService;
import com.turcato.ticiane.londonairportdistance.services.ProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller responsible for {@link Postcode} related CRUD operations
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class PostcodeController {

    @Autowired
    private ProxyService proxyService;

    @Autowired
    private PostcodeService postcodeService;

    @GetMapping("/search-history")
    private ResponseEntity<List<Postcode>> getSearchHistory(){
        return ResponseEntity.ok(postcodeService.getSearchHistory());
    }

    /**
     * Verify if the postcode is valid and retrieves region, longitude and latitude information about the postcode
     * @param postcode to search
     * @return the postcode information
     */
    @GetMapping("/{postcode}")
    private ResponseEntity<Postcode> getPostcode(@PathVariable String postcode) {

        if(proxyService.validatePostcode(postcode)){
            Postcode clientPostcode = proxyService.findPostcode(postcode);
            postcodeService.addToSearchesHistory(clientPostcode);
            return ResponseEntity.ok(clientPostcode);
        }

        return null;
    }

}
