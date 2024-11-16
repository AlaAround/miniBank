package com.example.demo.transaction;

import java.util.Date;

public class Transaction {
    private Date date;
    private Long from;
    private Long to;

    public Transaction(Date date, Long from, Long to) {
        this.date = date;
        this.from = from;
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public Long getFrom() {
        return from;
    }

    public Long getTo() {
        return to;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public void setTo(Long to) {
        this.to = to;
    }
}
