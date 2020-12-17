/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mascenes.store.model;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Order")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, updatable = false, nullable = false)
    private int orderID;
    
    private Date orderDate; 
    
    private double grandTotal;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails;
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double GrandTotal) {
        this.grandTotal = GrandTotal;
    }
    
    
}
