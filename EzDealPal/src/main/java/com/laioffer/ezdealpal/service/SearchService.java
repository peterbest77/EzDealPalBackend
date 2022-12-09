//package com.laioffer.ezdealpal.service;
//
//import com.laioffer.ezdealpal.entity.Product;
//import com.laioffer.ezdealpal.entity.ZipcodeMap;
//import com.laioffer.ezdealpal.repository.ProductRepository;
//import com.laioffer.ezdealpal.repository.ZipcodeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class SearchService {
//    private static double EARTH_RADIUS = 6371000;
//
//    private ProductRepository productRepository;
//    private ZipcodeRepository zipcodeRepository;
//
//    private static double rad(double d)
//    {
//        return d * Math.PI / 180.0;
//    }
//
//    public static double getDistance(double lon1,double lat1,double lon2, double lat2) {
//        double radLat1 = rad(lat1);
//        double radLat2 = rad(lat2);
//        double a = radLat1 - radLat2;
//        double b = rad(lon1) - rad(lon2);
//        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
//        s = s * EARTH_RADIUS;
//        s = Math.round(s * 10000) / 10000;
//        return s;
//    }
//    @Autowired
//    public SearchService(ProductRepository productRepository, ZipcodeRepository zipcodeRepository) {
//        this.productRepository = productRepository;
//        this.zipcodeRepository = zipcodeRepository;
//    }
//    public List<Product> searchProductsByDistance(String zipCode, String distance) {
//        List<Product> res = new ArrayList<>();
//        List<Product> allProducts = productRepository.findAll();
//        int distanceOfInput = Integer.parseInt(distance);
//        ZipcodeMap curZipcode = zipcodeRepository.getZipcodeMapByZipcode(zipCode);
//        double lat = Double.parseDouble(curZipcode.getLatitude());
//        double lon = Double.parseDouble(curZipcode.getLongitude());
//        for (Product p : allProducts) {
//            String zip = p.getZipcode();
//            ZipcodeMap productZipcode = zipcodeRepository.getZipcodeMapByZipcode(String.valueOf(zip));
//            double curLat = Double.parseDouble(productZipcode.getLatitude());
//            double curLon = Double.parseDouble(productZipcode.getLongitude());
//            int distanceOfBuyerAndProduct = (int)(getDistance(lon, lat, curLon, curLat) / 1000);
//            if (distanceOfBuyerAndProduct <= distanceOfInput) {
//                res.add(p);
//            }
//
//        }
//        return res;
//    }
//}
