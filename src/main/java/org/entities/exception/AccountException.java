package org.entities.exception;

import org.model.exceptions.BusinessException;
import org.model.exceptions.DomainException;

public class AccountException {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public AccountException(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public AccountException() {

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw (Double amount) throws BusinessException {

        if(amount > getWithdrawLimit()) {
            throw new BusinessException("The amount exceeds withdraw limit");
        }
        if(amount > getBalance()) {

            throw new BusinessException("Not enough balance");
        }

       balance -= amount;
    }

    @Override
    public String toString(){
        return "New balance: "
                + balance;
    }
}
