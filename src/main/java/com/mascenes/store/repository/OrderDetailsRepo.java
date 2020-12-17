package com.mascenes.store.repository;

import com.mascenes.store.model.Order;
import com.mascenes.store.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Long> {

    List<OrderDetails> findByOrder(Order order);
    List<OrderDetails> findByOrder(long orderId);

    @Override
    OrderDetails getOne(Long id);
}