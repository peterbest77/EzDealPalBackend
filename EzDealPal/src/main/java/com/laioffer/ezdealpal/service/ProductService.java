//package com.laioffer.ezdealpal.service;
//
//import com.laioffer.ezdealpal.entity.Product;
//import com.laioffer.ezdealpal.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//    @Autowired
//    private ProductRepository repository;
//
//    public Product saveProduct(Product product) {
//        return repository.save(product);
//    }
//
//    public List<Product> saveProducts(List<Product> products) {
//        return repository.saveAll(products);
//    }
//
//    public List<Product> getProducts() {
//        return repository.findAll();
//    }
//
//    public Product getProductById(int id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    public Product getProductByName(String name) {
//        return repository.findByName(name);
//    }
//
//    public String deleteProduct(int id) {
//        repository.deleteById(id);
//        return "product removed !! " + id;
//    }
//
//    public Product updateProduct(Product product) {
//        Product existingProduct = repository.findById(product.getProductID()).orElse(null);
//        existingProduct.setProductName(product.getProductName());
//        existingProduct.setPictureID(product.getPictureID());
//        existingProduct.setProductDescription(product.getProductDescription());
//        existingProduct.setProductKeywords(product.getProductKeywords());
//        existingProduct.setLastModifiedDate(product.getLastModifiedDate());
//        existingProduct.setStatus(product.getStatus());
//        return repository.save(existingProduct);
//    }
//
//
//}
