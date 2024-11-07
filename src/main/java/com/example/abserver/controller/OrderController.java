package com.example.abserver.controller;

import com.example.abserver.Service.EmailNotificationService;
import com.example.abserver.Service.OrderService;
import com.example.abserver.Service.SMSNotificationService;
import com.example.abserver.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService, EmailNotificationService emailService, SMSNotificationService smsService) {
        this.orderService = orderService;

        // Agregar observadores
        orderService.addObserver(emailService);
        orderService.addObserver(smsService);
    }

    @PostMapping("/{id}")
    public Order createOrder(@PathVariable Long id) {
        return orderService.createOrder(id);
    }

    @PutMapping("/{id}/status")
    public void updateOrderStatus(@PathVariable Long id, @RequestParam String status) {
        orderService.updateOrderStatus(id, status);
    }
}

