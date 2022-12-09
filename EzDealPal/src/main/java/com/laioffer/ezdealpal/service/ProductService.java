package com.laioffer.ezdealpal.service;

import com.laioffer.ezdealpal.entity.Product;
import com.laioffer.ezdealpal.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import com.laioffer.ezdealpal.entity.User;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private UserService userService;
   @Autowired
   private ProductRepository repository;

   public Product saveProduct(Product product) {
       Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
       String username = loggedInUser.getName();
       User user = userService.getUserId(username);

       product.setUser(user);
        return repository.save(product);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getProductID()).orElse(null);
        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductDescription(product.getProductDescription());
        existingProduct.setProductKeywords(product.getProductKeywords());
        //existingProduct.setLastModifiedDate(product.getLastModifiedDate());
        //existingProduct.setStatus(product.getStatus());
        return repository.save(existingProduct);
    }
}
