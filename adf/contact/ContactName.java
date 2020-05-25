package model.adf.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "name")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContactName {

    public ContactName(){};

    public ContactName(String part) {
        this.part = part;
    }

    public ContactName(String name, String part, String type) {
        this.name = name;
        this.part = part;
        this.type = type;
    }

    @XmlValue
    private String name;

    @XmlAttribute(name = "part")
    private String part;

    @XmlAttribute(name = "type")
    private String type;

    public String getPart() {
        return part;
    }

    public String getName(){
        return name;
    }

    public String gettype() { return type; }
    public void setName(String part, String name, String type){
        this.part = part;
        this.name = name;
        this.type = type;
    }
}
