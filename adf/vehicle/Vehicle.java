package model.adf.vehicle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import model.adf.Id;

@XmlRootElement(name="vehicle")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vehicle {

    public Vehicle(){};

    public Vehicle(VehicleStatus vehicleStatus, VehicleInterest interest, Id id, String year,
                   String make, String model, String vin,
                   String trim, String doors, String bodyStyle,
                   String transmission, String odometer, String condition,
                   ColorCombination colorCombination, String imageTag, String price,
                   String priceComments, Option option, VehicleFinance vehicleFinance,
                   String comments, String optionTotal) {
        this.status = vehicleStatus.getStatus();
        this.interest = interest.getInterest();
        this.id = id;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vin = vin;
        this.trim = trim;
        this.doors = doors;
        this.bodyStyle = bodyStyle;
        this.transmission = transmission;
        this.odometer = odometer;
        this.condition = condition;
        this.colorCombination = colorCombination;
        this.imageTag = imageTag;
        this.price = price;
        this.priceComments = priceComments;
        this.option = option;
        this.vehicleFinance = vehicleFinance;
        this.comments = comments;
        this.optionTotal = optionTotal;
    }

    @XmlAttribute(name = "status")
    private String status;

    @XmlAttribute(name = "interest")
    private String interest;

    @XmlElement(name = "id")
    private Id id;

    @XmlElement(name = "year")
    private String year;

    @XmlElement(name = "make")
    private String make;

    @XmlElement(name = "model")
    private String model;

    @XmlElement(name = "vin")
    private String vin;

    @XmlElement(name = "trim")
    private String trim;

    @XmlElement(name = "doors")
    private String doors;

    @XmlElement(name = "bodystyle")
    private String bodyStyle;

    @XmlElement(name = "transmission")
    private String transmission;

    @XmlElement(name = "odometer")
    private String odometer;

    @XmlElement(name = "condition")
    private String condition;

    @XmlElement(name = "colorcombination")
    private ColorCombination colorCombination;

    @XmlElement(name = "imagetag")
    private String imageTag;

    @XmlElement(name = "price")
    private String price;

    @XmlElement(name = "pricecomments")
    private String priceComments;

    @XmlElement(name = "option")
    private Option option;

    @XmlElement(name = "vehicleFinance")
    private VehicleFinance vehicleFinance;

    @XmlElement(name = "comments")
    private String comments;

    @XmlElement(name = "optiontotal")
    private String optionTotal;

    public String getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status.getStatus();
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public ColorCombination getColorCombination() {
        return colorCombination;
    }

    public void setColorCombination(ColorCombination colorCombination) {
        this.colorCombination = colorCombination;
    }

    public String getImageTag() {
        return imageTag;
    }

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceComments() {
        return priceComments;
    }

    public void setPriceComments(String priceComments) {
        this.priceComments = priceComments;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public VehicleFinance getVehicleFinance() {
        return vehicleFinance;
    }

    public void setVehicleFinance(VehicleFinance vehicleFinance) {
        this.vehicleFinance = vehicleFinance;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getOptionTotal() {
        return optionTotal;
    }

    public void setOptionTotal(String optionTotal) {
        this.optionTotal = optionTotal;
    }

    public String getInterest() {
        return interest;
    }
    public void setInterest(VehicleInterest interest) {
        this.interest = interest.getInterest();
    }
}
