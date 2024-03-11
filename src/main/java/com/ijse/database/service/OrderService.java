package com.ijse.database.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.ijse.database.dto.OrderDTO;
import com.ijse.database.entity.Item;
import com.ijse.database.entity.Order;

@Service
public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order createOrder(OrderDTO orderDTO);
    void updateItemQuantities(Set<Item> items);
}
