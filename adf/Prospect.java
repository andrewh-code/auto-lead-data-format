package model.adf;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import model.adf.customer.Customer;
import model.adf.provider.Provider;
import model.adf.vehicle.Vehicle;
import model.adf.vendor.Vendor;

@XmlRootElement(name="prospect")
@XmlAccessorType(XmlAccessType.FIELD)
public class Prospect {

    public Prospect(){};

    public Prospect(Id id, String configUrl, Date requestDate, Vehicle vehicle, Customer customer, Vendor vendor, Provider provider) {
        this.id = id;
        this.configUrl = configUrl;
        this.requestDate = requestDate;
        this.vehicle = vehicle;
        this.customer = customer;
        this.vendor = vendor;
        this.provider = provider;
    }

    @XmlElement(name = "id")
    private Id id;

    @XmlElement(name = "configurl")
    private String configUrl;

    //CCYY-MM-DDThh:mm:ss  or CCYY-MM-DDThh:mm:ss-05:00.
    @XmlElement(name = "requestdate")
    private Date requestDate;

    @XmlElement(name = "vehicle")
    private Vehicle vehicle;

    @XmlElement(name = "customer")
    private Customer customer;

    @XmlElement(name = "vendor")
    private Vendor vendor;

    @XmlElement(name = "provider")
    private Provider provider;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getConfigUrl() {
        return configUrl;
    }

    public void setConfigUrl(String configUrl) {
        this.configUrl = configUrl;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

}
