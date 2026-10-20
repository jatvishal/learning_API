package com.api_learing.api_learing.status.controller;

import com.api_learing.api_learing.status.model.StatusEntity;
import com.api_learing.api_learing.status.service.StatusService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.logging.Logger;

@RestController
@RequestMapping("/status")
public class StatusController {

    private final StatusService statusService;
    private static final Logger log =
            Logger.getLogger(StatusController.class.getName());

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/upOrDown")
    public ResponseEntity<StatusEntity> getStatus() {
        log.info("Inside get stats method call");
        StatusEntity entity = new StatusEntity("UP", Instant.now().toString(), "api_learing");
        StatusEntity saved = statusService.save(entity);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StatusEntity> getStatusById(@PathVariable Long id){
        log.info("inside get status by id method");
        StatusEntity entity = statusService.findById(id);
        if(entity != null){
            return ResponseEntity.ok(entity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
