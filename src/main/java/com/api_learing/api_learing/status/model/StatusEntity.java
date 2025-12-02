package com.api_learing.api_learing.status.model;

import jakarta.persistence.*;

@Entity
@Table (name = "statuses")
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String timestamp;
    private String application;

    public StatusEntity() {}

    public StatusEntity(String status, String timestamp, String application) {
        this.status = status;
        this.timestamp = timestamp;
        this.application = application;
    }
    public Long getId() {
        return id;
    }
    public String getStatus() {
        return status;
    }
    public String getTimestamp() {
        return timestamp;
    }

}
