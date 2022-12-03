package com.laioffer.ezdealpal.service;

import com.laioffer.ezdealpal.dao.ProductInfoDao;
import com.laioffer.ezdealpal.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductInfoService {
    @Autowired
    private ProductInfoDao productInfoDao;

    public Product getProduct(int productId) {
        return productInfoDao.getProduct(productId);
    }
}
