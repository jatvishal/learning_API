// java
package com.api_learing.api_learing.status.repository;

import com.api_learing.api_learing.status.model.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<StatusEntity, Long> {
}
