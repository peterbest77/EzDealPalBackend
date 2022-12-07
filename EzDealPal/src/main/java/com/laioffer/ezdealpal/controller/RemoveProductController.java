package com.laioffer.ezdealpal.controller;

import com.laioffer.ezdealpal.entity.Product;
import com.laioffer.ezdealpal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

// https://github.com/Java-Techie-jt/spring-boot-crud-example/blob/master/src/main/java/com/javatechie/crud/example/controller/ProductController.java
@Controller
public class RemoveProductController {
   @Autowired
   private ProductService service;

   @DeleteMapping("/deleteProduct/{id}")
   public String deleteProduct(@PathVariable int id) {
       return service.deleteProduct(id);
   }
}
