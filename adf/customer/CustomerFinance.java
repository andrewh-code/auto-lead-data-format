package model.adf.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="finance")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerFinance {

    public CustomerFinance(){};

    public CustomerFinance(String month, String rate, String monthly, String biweekly, String weekly, String balance) {
        this.month = month;
        this.rate = rate;
        this.monthly = monthly;
        this.biweekly = biweekly;
        this.weekly = weekly;
        this.balance = balance;
    }

    // TODO: fill this all out when needed
    private String month;
    private String rate;
    private String monthly;
    private String biweekly;
    private String weekly;
    private String balance;

}
