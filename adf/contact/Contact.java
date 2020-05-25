package model.adf.contact;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="contact")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contact {

    public Contact(){}

    @XmlElement(name = "name")
    private List<ContactName> contactName;

    @XmlElement(name = "email")
    private String email;

    @XmlElement(name = "phone")
    private String phone;

    @XmlElement(name = "address")
    private Address address;

    public List<ContactName> getContactName() {
        return contactName;
    }

    public void setContactName(List<ContactName> contactName) {
        this.contactName = contactName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
