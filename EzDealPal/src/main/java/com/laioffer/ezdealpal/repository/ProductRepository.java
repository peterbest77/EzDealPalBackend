package com.laioffer.ezdealpal.repository;

import com.laioffer.ezdealpal.entity.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAll();
    Product findByProductName(String name);
    Product save(Product product);
    @Modifying
    @Query("delete from Product p where p.productID = ?1")
    void deleteById(int id);


}
