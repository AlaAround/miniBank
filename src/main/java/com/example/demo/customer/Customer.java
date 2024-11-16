package com.example.demo.customer;
import com.example.demo.transaction.Transaction;

import java.util.List;

public class Customer {
    private Long id;
    private String username;
    private String email;
    private String phonenumber;
    private List<Transaction> transactions;
    private float balance;

    public Customer() {
    }

    public Customer(Long id, String username, String email, String phonenumber, List<Transaction> transactions, float balance) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phonenumber = phonenumber;
        this.transactions = transactions;
        this.balance = balance;
    }

    public Customer(String username, String email, String phonenumber, List<Transaction> transactions, float balance) {
        this.username = username;
        this.email = email;
        this.phonenumber = phonenumber;
        this.transactions = transactions;
        this.balance = balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public float getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", transactions=" + transactions +
                ", balance=" + balance +
                '}';
    }
}
