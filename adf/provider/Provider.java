package model.adf.provider;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import model.adf.Id;
import model.adf.contact.Contact;

@XmlRootElement(name="provider")
@XmlAccessorType(XmlAccessType.FIELD)
public class Provider {

    public Provider() {
    }

    public Provider(Id id, String subSourceId, String service, String name,
                    String phone, String url, String email, Contact contact) {
        this.id = id;
        this.subSourceId = subSourceId;
        this.service = service;
        this.name = name;
        this.url = url;
        this.email = email;
        this.phone = phone;
        this.contact = contact;
    }

    @XmlElement(name = "id")
    private Id id;

    @XmlElement(name = "subsourceid")
    private String subSourceId;

    @XmlElement(name = "service")
    private String service;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "url")
    private String url;

    @XmlElement(name = "email")
    private String email;

    @XmlElement(name = "phone")
    private String phone;

    @XmlElement(name = "contact")
    private Contact contact;


    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getSubSourceId() {
        return subSourceId;
    }

    public void setSubSourceId(String subSourceId) {
        this.subSourceId = subSourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
