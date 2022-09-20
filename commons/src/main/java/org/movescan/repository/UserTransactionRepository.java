package org.movescan.repository;

import org.movescan.entity.UserTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTransactionRepository extends JpaRepository<UserTransactionEntity, String> {
}
