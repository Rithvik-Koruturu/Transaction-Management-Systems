package com.example.transaction.dto;

public class TransactionDTO {

    private Long fromAccount;
    private Long toAccount;
    private Double amount;
    private String description;

    // Constructor
    public TransactionDTO(Long fromAccount, Long toAccount, Double amount, String description) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.description = description;
    }

    // Getters and Setters
    public Long getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Long fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Long getToAccount() {
        return toAccount;
    }

    public void setToAccount(Long toAccount) {
        this.toAccount = toAccount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Optional: Override toString() for better logging/debugging
    @Override
    public String toString() {
        return "TransactionDTO [fromAccount=" + fromAccount + ", toAccount=" + toAccount + 
                ", amount=" + amount + ", description=" + description + "]";
    }
}
