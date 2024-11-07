package com.example.abserver.Service;

import com.example.abserver.domain.Observer;
import com.example.abserver.domain.Order;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("Email Notification: Order " + order.getId() + " changed to " + order.getStatus());
    }
}