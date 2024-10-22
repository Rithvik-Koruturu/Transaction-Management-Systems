package com.example.transactionmanagement.service;

import com.example.transactionmanagement.model.Transaction;
import com.example.transactionmanagement.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getTransactions(String date, String status) {
        if (date != null && status != null) {
            return transactionRepository.findByDateAndStatus(date, status);
        } else if (date != null) {
            return transactionRepository.findByDate(date);
        } else if (status != null) {
            return transactionRepository.findByStatus(status);
        } else {
            return transactionRepository.findAll();
        }
    }

    @Override
    public Transaction getTransactionById(Long id) {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        return transaction.orElse(null); // Return null or throw an exception if not found
    }

    @Override
    public Transaction updateTransaction(Long id, Transaction transaction) {
        transaction.setId(id); // Ensure the ID is set for the existing transaction
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }

    @Override
    public String exportTransactionsToCSV() {
        List<Transaction> transactions = transactionRepository.findAll();
        StringBuilder csvBuilder = new StringBuilder();
        csvBuilder.append("Date,Description,Amount,Status\n");
        for (Transaction transaction : transactions) {
            csvBuilder.append(transaction.getDate())
                    .append(",").append(transaction.getDescription())
                    .append(",").append(transaction.getAmount())
                    .append(",").append(transaction.getStatus()).append("\n");
        }
        return csvBuilder.toString();
    }
}
