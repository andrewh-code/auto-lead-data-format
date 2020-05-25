package model.adf.vehicle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import model.adf.vehicle.FinanceMethod;

@XmlRootElement(name="finance")
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleFinance {

    public VehicleFinance(){}

    @XmlElement(name = "method")
    private FinanceMethod financeMethod;

    // TODO: xml attribute
    @XmlElement(name = "amount")
    private Double amount;

    @XmlElement(name = "balance")
    private Double balance;
}
