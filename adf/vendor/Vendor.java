package model.adf.vendor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import model.adf.Id;
import model.adf.contact.Contact;

@XmlRootElement(name="vendor")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vendor {

    public Vendor() {
    }

    public Vendor(String id, String vendorName, String url, Contact contact) {
        this.id = id;
        this.vendorName = vendorName;
        this.url = url;
        this.contact = contact;
    }

    @XmlElement(name = "id")
    private String id;

    @XmlElement(name = "vendorname")
    private String vendorName;

    @XmlElement(name = "url")
    private String url;

    @XmlElement(name="contact")
    private Contact contact;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
