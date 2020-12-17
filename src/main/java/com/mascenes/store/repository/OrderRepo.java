package com.mascenes.store.repository;

import com.mascenes.store.model.Order;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
    @Override
    List<Order> findAll(Sort sort);

    List<Order> findByOrderDate(Date date);

    @Override
    Order getOne(Long id);
}