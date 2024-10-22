package com.example.transactionmanagement.repository;

import com.example.transactionmanagement.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    
    List<Transaction> findByDateAndStatus(String date, String status);
    List<Transaction> findByDate(String date);
    List<Transaction> findByStatus(String status);
}

