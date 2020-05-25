package model.adf.vehicle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="option")
@XmlAccessorType(XmlAccessType.FIELD)
public class Option {

    public Option(){};

    public Option(String optionName, String manufacturerCode, String stock, String weighting, String price) {
        this.optionName = optionName;
        this.manufacturerCode = manufacturerCode;
        this.stock = stock;
        this.weighting = weighting;
        this.price = price;
    }

    @XmlElement(name = "optionname")
    public String optionName;

    @XmlElement(name = "manufacturercode")
    public String manufacturerCode;

    @XmlElement(name = "stock")
    public String stock;

    @XmlElement(name = "weighting")
    public String weighting;

    @XmlElement(name = "price")
    public String price;

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getWeighting() {
        return weighting;
    }

    public void setWeighting(String weighting) {
        this.weighting = weighting;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
