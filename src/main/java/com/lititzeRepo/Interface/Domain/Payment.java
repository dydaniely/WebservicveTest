package com.lititzeRepo.Interface.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Payment {
    @Id
    private int paymentId;
    private String payComp;
    private String payAmt;
    private String payEmail;
    private Date startTime;
    private String tokenPaams;
    private String rtpUrl;
    private String payStatus;
    private String payTime;
    private String payRefNo;
    private char modeCode;
    private String paymentPeriod;/* TODO  Period table need to be constructed*/
    private String  paymentMode;
    private String paymentDate;
    private int attempt;
     @ManyToOne
     @JoinColumn(name = "policyId")
    private Policy policy;

    public Payment() {
    }

    public Payment(int paymentId, String payComp, String payAmt) {
        this.paymentId = paymentId;
        this.payComp = payComp;
        this.payAmt = payAmt;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPayComp() {
        return payComp;
    }

    public void setPayComp(String payComp) {
        this.payComp = payComp;
    }

    public String getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(String payAmt) {
        this.payAmt = payAmt;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public String getPayEmail() {
        return payEmail;
    }

    public void setPayEmail(String payEmail) {
        this.payEmail = payEmail;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getTokenPaams() {
        return tokenPaams;
    }

    public void setTokenPaams(String tokenPaams) {
        this.tokenPaams = tokenPaams;
    }

    public String getRtpUrl() {
        return rtpUrl;
    }

    public void setRtpUrl(String rtpUrl) {
        this.rtpUrl = rtpUrl;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getPayRefNo() {
        return payRefNo;
    }

    public void setPayRefNo(String payRefNo) {
        this.payRefNo = payRefNo;
    }

    public char getModeCode() {
        return modeCode;
    }

    public void setModeCode(char modeCode) {
        this.modeCode = modeCode;
    }

    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}
