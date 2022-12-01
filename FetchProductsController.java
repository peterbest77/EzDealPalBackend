package com.laioffer.ezdealpal.controller;

import com.laioffer.ezdealpal.entity.Product;
import com.laioffer.ezdealpal.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FetchProductsController {
    private SearchService searchService;

    @Autowired
    public FetchProductsController(SearchService searchService) {
        this.searchService = searchService;
    }
    @GetMapping(value = "/search")
    public List<Product> searchProducts(
            @RequestParam(name = "zip_code") String zipCode,
            @RequestParam(name = "distance") String distance
    ) {
        return searchService.searchProductsByDistance(zipCode, distance);
    }
}
