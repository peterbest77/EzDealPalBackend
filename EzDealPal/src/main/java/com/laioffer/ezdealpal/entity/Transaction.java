package com.laioffer.ezdealpal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Product product;

    @ManyToOne
    @JsonIgnore
    private User buyer;

    @ManyToOne
    @JsonIgnore
    private User seller;

    private EScore scoreToBuyer;

    private EScore scoreToSeller;

    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public EScore getScoreToBuyer() {
        return scoreToBuyer;
    }

    public void setScoreToBuyer(EScore scoreToBuyer) {
        this.scoreToBuyer = scoreToBuyer;
    }

    public EScore getScoreToSeller() {
        return scoreToSeller;
    }

    public void setScoreToSeller(EScore scoreToSeller) {
        this.scoreToSeller = scoreToSeller;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
