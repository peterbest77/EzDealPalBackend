package com.laioffer.ezdealpal.controller;

import com.laioffer.ezdealpal.entity.Product;
import com.laioffer.ezdealpal.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductInfoController {
    @Autowired
    private ProductInfoService productInfoService;

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
    @ResponseBody
    public Product getProduct(@PathVariable("productId") int productId) {
        return productInfoService.getProduct(productId);
    }
}
