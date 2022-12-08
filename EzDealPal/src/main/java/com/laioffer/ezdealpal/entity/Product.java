package com.laioffer.ezdealpal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productID;
    private String Url;
    private String productName;
    private String lastModifiedDate;
    private String pictureID;
    private String productDescription;
    private String productKeywords;
    private String publicDate;
    private EStatus status;
    private String zipcode;

    private String userId;

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
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPictureID() {
        return pictureID;
    }

    public void setPictureID(String pictureID) {
        this.pictureID = pictureID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
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

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

   public EStatus getStatus() {
       return status;
   }

   public void setStatus(EStatus status) {
       this.status = status;
   }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
