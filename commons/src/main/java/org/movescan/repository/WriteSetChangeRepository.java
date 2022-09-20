package org.movescan.repository;

import org.movescan.entity.WriteSetChangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WriteSetChangeRepository extends JpaRepository<WriteSetChangeEntity, String> {
}
