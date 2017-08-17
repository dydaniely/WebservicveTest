package com.lititzeRepo.Interface.Domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Policy {
    @Id
    private int policyId;
    private String insuredName;
    private String PolComp;
    @ManyToOne
    @JoinColumn(name = "accountID")
    private Account account;
    @OneToMany(mappedBy = "policy")
    private List<Payment> payments;
    private String polType;
    private String polAdress;
    private String polCity;
    private String PolSt;
    private String polZip;
    private String PolSrc;
    private String polOrgSrc;
    private long lastPayAmt;
    private String lastPayDate;

    public Policy() {
    }

    public Policy(int policyId, String insuredName, String polComp) {
        this.policyId = policyId;
        this.insuredName = insuredName;
        PolComp = polComp;
    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getPolComp() {
        return PolComp;
    }

    public void setPolComp(String polComp) {
        PolComp = polComp;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public String getPolType() {
        return polType;
    }

    public void setPolType(String polType) {
        this.polType = polType;
    }

    public String getPolAdress() {
        return polAdress;
    }

    public void setPolAdress(String polAdress) {
        this.polAdress = polAdress;
    }

    public String getPolCity() {
        return polCity;
    }

    public void setPolCity(String polCity) {
        this.polCity = polCity;
    }

    public String getPolSt() {
        return PolSt;
    }

    public void setPolSt(String polSt) {
        PolSt = polSt;
    }

    public String getPolZip() {
        return polZip;
    }

    public void setPolZip(String polZip) {
        this.polZip = polZip;
    }

    public String getPolSrc() {
        return PolSrc;
    }

    public void setPolSrc(String polSrc) {
        PolSrc = polSrc;
    }

    public String getPolOrgSrc() {
        return polOrgSrc;
    }

    public void setPolOrgSrc(String polOrgSrc) {
        this.polOrgSrc = polOrgSrc;
    }

    public long getLastPayAmt() {
        return lastPayAmt;
    }

    public void setLastPayAmt(long lastPayAmt) {
        this.lastPayAmt = lastPayAmt;
    }

    public String getLastPayDate() {
        return lastPayDate;
    }

    public void setLastPayDate(String lastPayDate) {
        this.lastPayDate = lastPayDate;
    }
}
