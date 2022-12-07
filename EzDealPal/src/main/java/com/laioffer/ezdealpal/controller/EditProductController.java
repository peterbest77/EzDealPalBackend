package com.laioffer.ezdealpal.controller;

import com.laioffer.ezdealpal.entity.Product;
import com.laioffer.ezdealpal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

// https://github.com/Java-Techie-jt/spring-boot-crud-example/blob/master/src/main/java/com/javatechie/crud/example/controller/ProductController.java
@Controller
public class EditProductController {
   @Autowired
   private ProductService service;

   @PutMapping("/updateProduct")
   public Product updateProduct(@RequestBody Product product) {
       return service.updateProduct(product);
   }
}
