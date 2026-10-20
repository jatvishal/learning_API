// java
package com.api_learing.api_learing.status.service;

import com.api_learing.api_learing.status.model.StatusEntity;
import com.api_learing.api_learing.status.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {

    @Autowired
    private final StatusRepository repository;

    public StatusService(StatusRepository repository) {
        this.repository = repository;
    }

    public StatusEntity save(StatusEntity status) {
        return repository.save(status);
    }

    public StatusEntity findById(Long id){
        return repository.findById(id).orElse(null);
    }
}
