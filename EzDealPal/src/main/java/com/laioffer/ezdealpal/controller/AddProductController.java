package com.laioffer.ezdealpal.controller;

import com.laioffer.ezdealpal.entity.Product;
import com.laioffer.ezdealpal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// https://github.com/Java-Techie-jt/spring-boot-crud-example/blob/master/src/main/java/com/javatechie/crud/example/controller/ProductController.java
@Controller
public class AddProductController {
   @Autowired
   private ProductService service;

//   @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
//   public Product addProduct(@RequestBody Product product) {
//       return service.saveProduct(product);
//   }

   @RequestMapping(value = "/addProduct", method = RequestMethod.PUT)
   @ResponseStatus(value = HttpStatus.CREATED)
   public void addProduct(@RequestBody Product product) {
      service.saveProduct(product);
   }
}
