package model.adf.contact;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

    public Address(){};

    public Address(List<StreetLine> street, String apartment, String city, String regionCode, String postalCode, String country) {
        this.street = street;
        this.apartment = apartment;
        this.city = city;
        this.regionCode = regionCode;
        this.postalCode = postalCode;
        this.country = country;
    }

    @XmlElement(name = "street")
    private List<StreetLine> street;
    @XmlElement(name = "apartment")
    private String apartment;
    @XmlElement(name = "city")
    private String city;
    @XmlElement(name = "regioncode")
    private String regionCode;
    @XmlElement(name = "postalcode")
    private String postalCode;
    @XmlElement(name = "country")
    private String country;


    public List<StreetLine> getStreet() {
        return street;
    }

    public void setStreet(List<StreetLine> street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegionCode() {
        return regionCode;
    }

    // two character code
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
