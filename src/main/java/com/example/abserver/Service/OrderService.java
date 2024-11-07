package com.example.abserver.Service;

import com.example.abserver.domain.Order;
import com.example.abserver.domain.Subject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderService extends Subject {
    private Map<Long, Order> orders = new HashMap<>();

    public Order createOrder(Long id) {
        Order order = new Order(id, "pendiente");
        orders.put(id, order);
        return order;
    }

    public void updateOrderStatus(Long id, String status) {
        Order order = orders.get(id);
        if (order != null) {
            order.setStatus(status);
            notifyObservers(order);
        }
    }
}

