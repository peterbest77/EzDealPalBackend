package com.laioffer.ezdealpal.repository;

import com.laioffer.ezdealpal.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAll();

}
