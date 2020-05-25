package model.adf.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import model.adf.contact.Contact;

@XmlRootElement(name="customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

    public Customer(){};

    @XmlElement(name = "contact")
    private Contact contact;

    @XmlElement(name = "id")
    private String id;

    @XmlElement(name = "timeframe")
    private TimeFrame timeFrame;

    @XmlElement(name = "comments")
    private String comments;

    @XmlElement(name = "finance")
    private CustomerFinance finance;

    @XmlElement(name = "lease")
    private Lease lease;

    @XmlElement(name = "cash")
    private Cash cash;

    @XmlElement(name = "summary")
    private Summary summary;

    @XmlElement(name = "credit")
    private Credit credit;


    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TimeFrame getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(TimeFrame timeFrame) {
        this.timeFrame = timeFrame;
    }

    public CustomerFinance getFinance() {
        return finance;
    }

    public void setFinance(CustomerFinance finance) {
        this.finance = finance;
    }

    public Lease getLease() {
        return lease;
    }

    public void setLease(Lease lease) {
        this.lease = lease;
    }

    public Cash getCash() {
        return cash;
    }

    public void setCash(Cash cash) {
        this.cash = cash;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
