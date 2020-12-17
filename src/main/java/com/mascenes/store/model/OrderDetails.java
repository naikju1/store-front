/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mascenes.store.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "OrderDetails")
public class OrderDetails implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, updatable = false, nullable = false)
    private int OrderDetailID;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "orderID", nullable = false)
    private Order order;
    
    @OneToOne
    private Product product;

    private double ItemTotal;

    public int getOrderDetailID() {
        return OrderDetailID;
    }

    public void setOrderDetailID(int OrderDetailID) {
        this.OrderDetailID = OrderDetailID;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getItemTotal() {
        return ItemTotal;
    }

    public void setItemTotal(double ItemTotal) {
        this.ItemTotal = ItemTotal;
    }
    
    
}
