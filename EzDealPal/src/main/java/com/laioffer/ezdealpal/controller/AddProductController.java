package com.laioffer.ezdealpal.controller;

import com.laioffer.ezdealpal.entity.Product;
import com.laioffer.ezdealpal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// https://github.com/Java-Techie-jt/spring-boot-crud-example/blob/master/src/main/java/com/javatechie/crud/example/controller/ProductController.java
public class AddProductController {
   @Autowired
   private ProductService service;

   @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
   public Product addProduct(@RequestBody Product product) {
       return service.saveProduct(product);
   }
}
