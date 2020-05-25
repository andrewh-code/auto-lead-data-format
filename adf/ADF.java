package model.adf;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name= "model/adf")
@XmlAccessorType(XmlAccessType.FIELD)
public class ADF {

    public ADF(){};

    @XmlElement(name="prospect")
    Prospect prospect;

    public ADF(Prospect prospect){
        this.prospect = prospect;
    }

//    @XmlElement(name="vehicle")
//    Vehicle vehicle;
//
//    @XmlElement(name="customer")
//    Customer customer;
//
//    @XmlElement(name="vendor")
//    Vendor vendor;
//
//    @XmlElement(name="provider")
//    Provider provider;


    public Prospect getProspect() {
        return prospect;
    }

    public void setProspect(Prospect prospect) {
        this.prospect = prospect;
    }

//    public Vehicle getVehicle() {
//        return vehicle;
//    }
//
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public Vendor getVendor() {
//        return vendor;
//    }
//
//    public void setVendor(Vendor vendor) {
//        this.vendor = vendor;
//    }
//
//    public Provider getProvider() {
//        return provider;
//    }
//
//    public void setProvider(Provider provider) {
//        this.provider = provider;
//    }

}
