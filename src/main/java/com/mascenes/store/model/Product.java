package com.mascenes.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, updatable = false, nullable = false)
    private long productID;
    private String title;
    private String description;
    private String color;
    private String size;
    private String reason;
    private float price;
    private int stock;
    @Column(unique = true, nullable = false)
    private String barCodeNumber;
    

    public long getProductID() {
        return productID;
    }

    public void setProductID(long ProductID) {
        this.productID = ProductID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        this.title = Title;
    }

    public String getTextDescription() {
        return description;
    }

    public void setTextDescription(String TextDescription) {
        this.description = TextDescription;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String Size) {
        this.size = Size;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String Reason) {
        this.reason = Reason;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBarcodeNumber() {
        return barCodeNumber;
    }

    public void setBarcodeNumber(String BarcodeNumber) {
        this.barCodeNumber = BarcodeNumber;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int Stock) {
        this.stock = Stock;
    }
    
    
}
