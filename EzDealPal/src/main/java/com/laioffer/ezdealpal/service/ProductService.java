package com.laioffer.ezdealpal.service;

import com.laioffer.ezdealpal.entity.Product;
import com.laioffer.ezdealpal.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
   @Autowired
   private ProductRepository repository;

   public Product saveProduct(Product product) {
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
