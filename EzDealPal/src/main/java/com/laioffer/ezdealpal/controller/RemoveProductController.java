package com.laioffer.ezdealpal.controller;

import com.laioffer.ezdealpal.entity.Product;
import com.laioffer.ezdealpal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// https://github.com/Java-Techie-jt/spring-boot-crud-example/blob/master/src/main/java/com/javatechie/crud/example/controller/ProductController.java
@Controller
public class RemoveProductController {
   @Autowired
   private ProductService productService;

   @RequestMapping(value = "/deleteProduct/{productID}", method = RequestMethod.GET)
   @ResponseBody
   public void deleteProduct(@PathVariable("productID") int productID) {
      productService.deleteProduct(productID);
   }

//   @RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
////   @ResponseStatus(value = HttpStatus.OK)
//   public String deleteProduct() {
//      return ProductService.deleteProduct();
//   }
}
