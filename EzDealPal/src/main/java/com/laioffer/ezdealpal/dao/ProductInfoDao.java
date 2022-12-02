package com.laioffer.ezdealpal.dao;

import com.laioffer.ezdealpal.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductInfoDao {
    @Autowired
    private SessionFactory sessionFactory;

    public Product getProduct(int productId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Product.class, productId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
