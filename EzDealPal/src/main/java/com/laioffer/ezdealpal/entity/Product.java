package com.laioffer.ezdealpal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.mapping.ToOne;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "products")
public class Product implements Serializable {
    private static final long serialVersionUID = 2455760938074036111L;


    //private String sellerID;
    //private String buyerId;
    @Id
    @Column(name="productID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productID;

    private String url;
    private String productName;
    //private String lastModifiedDate;
    private String productDescription;
    private String productKeywords;
    private String publicDate;
   // @Column(name="status", nullable = false, columnDefinition = "AVAILABLE")
    private String status;

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    private String zipcode;

//    @ManyToOne
//    @JsonIgnore
//    private ZipcodeMap ZipcodeMap;

    @ManyToOne
    @JsonIgnore
    private User user;

//    @ManyToOne
//    @JsonIgnore
//    private User user;

//    public String getSellerID() {
//        return sellerID;
//    }

//    public void setSellerID(String sellerID) {
//        this.sellerID = sellerID;
//    }
//
//    public String getBuyerId() {
//        return buyerId;
//    }
//
//    public void setBuyerId(String buyerId) {
//        this.buyerId = buyerId;
//    }

    public String getUserId() {
        return user.getUserId();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductKeywords() {
        return productKeywords;
    }

    public void setProductKeywords(String productKeywords) {
        this.productKeywords = productKeywords;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

//    public String getLastModifiedDate() {
//        return lastModifiedDate;
//    }
//
//    public void setLastModifiedDate(String lastModifiedDate) {
//        this.lastModifiedDate = lastModifiedDate;
//    }

   public String getStatus() {
       return status;
   }

   public void setStatus(String status) {
       this.status = status;
   }

    public Integer getProductID() {
        return productID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
