package com.api_learing.api_learing.status.controller;

import com.api_learing.api_learing.status.model.StatusEntity;
import com.api_learing.api_learing.status.service.StatusService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/status")
public class StatusController {

    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping
    public ResponseEntity<StatusEntity> getStatus() {
        StatusEntity entity = new StatusEntity("UP", Instant.now().toString(), "api_learing");
        StatusEntity saved = statusService.save(entity);
        return ResponseEntity.ok(saved);
    }
}
