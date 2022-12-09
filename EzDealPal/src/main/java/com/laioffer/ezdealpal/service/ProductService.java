package com.laioffer.ezdealpal.service;

import com.laioffer.ezdealpal.dao.ProductDao;
import com.laioffer.ezdealpal.entity.Product;
import com.laioffer.ezdealpal.entity.User;
import com.laioffer.ezdealpal.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductDao productDao;

    @Autowired
    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }




   public void saveProduct(Product product) {


       Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
       String username = loggedInUser.getName();
       User user = userService.getUserId(username);

       product.setUser(user);
       productDao.save(product);
    }

//    public String deleteProduct(int id) {
//        repository.deleteById(id);
//        return "product removed !! " + id;
//    }

//    public Product updateProduct(Product product) {
//        Product existingProduct = repository.findById(product.getProductID()).orElse(null);
//        existingProduct.setProductName(product.getProductName());
//        existingProduct.setProductDescription(product.getProductDescription());
//        existingProduct.setProductKeywords(product.getProductKeywords());
//        //existingProduct.setLastModifiedDate(product.getLastModifiedDate());
//        //existingProduct.setStatus(product.getStatus());
//        return repository.save(existingProduct);
//    }
}
