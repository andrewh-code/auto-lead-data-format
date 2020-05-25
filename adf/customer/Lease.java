package model.adf.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="lease")
@XmlAccessorType(XmlAccessType.FIELD)
public class Lease {

    public Lease() {
    }

    // TODO: use this when needed (xml elements)
    public Lease(String month, String rate, String monthly, String biweekly, String weekly, String balance, String payable) {
        this.month = month;
        this.rate = rate;
        this.monthly = monthly;
        this.biweekly = biweekly;
        this.weekly = weekly;
        this.balance = balance;
        this.payable = payable;
    }

    private String month;
    private String rate;
    private String monthly;
    private String biweekly;
    private String weekly;
    private String balance;
    private String payable;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getMonthly() {
        return monthly;
    }

    public void setMonthly(String monthly) {
        this.monthly = monthly;
    }

    public String getBiweekly() {
        return biweekly;
    }

    public void setBiweekly(String biweekly) {
        this.biweekly = biweekly;
    }

    public String getWeekly() {
        return weekly;
    }

    public void setWeekly(String weekly) {
        this.weekly = weekly;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getPayable() {
        return payable;
    }

    public void setPayable(String payable) {
        this.payable = payable;
    }
}
