package com.lititzeRepo.Interface.Domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Account {
    @Id
    private int accountID;
    @Column(unique = true)
    private String email;
    private String password;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    @OneToMany(mappedBy = "account")
    private List<Policy> policies;

    private String regComp;
    private String regName;
    private Date modOn;
    private String modBy;
    private Date lastLogInTime;
    private int dominoPw;
    private int dominoAcct;


    public Account(int accountID, String email, String password   ) {
        this.accountID = accountID;
        this.email = email;
        this.password = password;
    }
    public Account() {
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public String getRegComp() {
        return regComp;
    }

    public void setRegComp(String regComp) {
        this.regComp = regComp;
    }

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    public Date getModOn() {
        return modOn;
    }

    public void setModOn(Date modOn) {
        this.modOn = modOn;
    }

    public String getModBy() {
        return modBy;
    }

    public void setModBy(String modBy) {
        this.modBy = modBy;
    }

    public Date getLastLogInTime() {
        return lastLogInTime;
    }

    public void setLastLogInTime(Date lastLogInTime) {
        this.lastLogInTime = lastLogInTime;
    }

    public int getDominoPw() {
        return dominoPw;
    }

    public void setDominoPw(int dominoPw) {
        this.dominoPw = dominoPw;
    }

    public int getDominoAcct() {
        return dominoAcct;
    }

    public void setDominoAcct(int dominoAcct) {
        this.dominoAcct = dominoAcct;
    }
}
