package model.adf.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cash")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cash {

    public Cash() {
    }

    // TODO: fill this out with xml when needed
    public Cash(Double msrp, Double mrc, Double subTotal) {
        this.msrp = msrp;
        this.mrc = mrc;
        this.subTotal = subTotal;
    }

    private Double msrp;
    private Double mrc;
    private Double subTotal;

    public Double getMsrp() {
        return msrp;
    }

    public void setMsrp(Double msrp) {
        this.msrp = msrp;
    }

    public Double getMrc() {
        return mrc;
    }

    public void setMrc(Double mrc) {
        this.mrc = mrc;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }
}
