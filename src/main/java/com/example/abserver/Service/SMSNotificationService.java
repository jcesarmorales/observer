package com.example.abserver.Service;

import com.example.abserver.domain.Observer;
import com.example.abserver.domain.Order;
import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("SMS Notification: Order " + order.getId() + " changed to " + order.getStatus());
    }
}

