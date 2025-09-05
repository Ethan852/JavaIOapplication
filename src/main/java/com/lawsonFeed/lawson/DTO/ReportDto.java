package com.lawsonFeed.lawson.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
public class ReportDto {

    private String name;  //"", char(5)
    private int number;   // char(2)
    private BigDecimal amount; // char(4)
    private char seq; //"" char(1)

    //1. check null

    public ReportDto(String name, int number, BigDecimal amount, char seq){
        this.name = name;
        this.number = number;
        this.amount = amount;
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public char getSeq() {
        return seq;
    }

    public void setSeq(char seq) {
        this.seq = seq;
    }

    public void setName(String name) {
        this.name = name;
    }
}
