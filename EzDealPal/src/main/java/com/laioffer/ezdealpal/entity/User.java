package com.laioffer.ezdealpal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 2652327633296064143L;

    @Id
    private String userId; // email

    private String name;

    private String password;

    private String phoneNumber;

    private int zipcode;

    private String address;

//    private Double scoreAsBuyer;
//
//    private Double scoreAsSeller;

//    public List<Product> getProductList() {
//        return productList;
//    }
//
//    public void setProductList(List<Product> productList) {
//        this.productList = productList;
//    }

    private boolean enabled;




    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Product> productList;



    public User() {
    }

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

//    public Double getScoreAsBuyer() {
//        return scoreAsBuyer;
//    }
//
//    public void setScoreAsBuyer(Double scoreAsBuyer) {
//        this.scoreAsBuyer = scoreAsBuyer;
//    }
//
//    public Double getScoreAsSeller() {
//        return scoreAsSeller;
//    }
//
//    public void setScoreAsSeller(Double scoreAsSeller) {
//        this.scoreAsSeller = scoreAsSeller;
//    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String username) {
        this.name = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
