package com.example.transactionmanagement.service;

import com.example.transactionmanagement.model.Transaction;

import java.util.List;

public interface TransactionService {
    
    Transaction createTransaction(Transaction transaction);
    List<Transaction> getTransactions(String date, String status);
    Transaction getTransactionById(Long id);
    Transaction updateTransaction(Long id, Transaction transaction);
    void deleteTransaction(Long id);
    String exportTransactionsToCSV();
}


