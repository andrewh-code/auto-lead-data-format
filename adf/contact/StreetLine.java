package model.adf.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "street")
@XmlAccessorType(XmlAccessType.FIELD)
public class StreetLine {

    public StreetLine(){}

    public StreetLine(String line, String street) {
        this.line = line;
        this.street = street;
    }

    @XmlAttribute
    private String line;

    @XmlValue
    private String street;


    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
