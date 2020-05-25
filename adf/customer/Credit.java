package model.adf.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="credit")
@XmlAccessorType(XmlAccessType.FIELD)
public class Credit {

    public Credit() {
    }

    public Credit(double total) {
        this.total = total;
    }

    @XmlElement(name = "total")
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
