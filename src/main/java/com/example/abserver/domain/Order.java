package com.example.abserver.domain;

public class Order {
    private Long id;
    private String status; // "pendiente", "procesado", etc.

    public Order(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
