package Complete.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pointdatabase")
public class pointdatabase {
    @Id
    private String policyId;
    private String insuredName;
    private String PolComp;
    private String polType;
    private String polAdress;
    private String polCity;
    private String PolSt;
    private String polZip;
    private String PolSrc;
    private String polOrgSrc;
    private long lastPayAmt;
    private String lastPayDate;
    private String policyDec;
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
    private String paymentMode;
    private String paymentDate;
    private int attempt;

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
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

    public String getPolicyDec() {
        return policyDec;
    }

    public void setPolicyDec(String policyDec) {
        this.policyDec = policyDec;
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
}
