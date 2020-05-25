package model.adf.customer;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="timeframe")
@XmlAccessorType(XmlAccessType.FIELD)
public class TimeFrame {

    public TimeFrame(){};

    public TimeFrame(String description, Date earliestDate, Date latestDate) {
        this.description = description;
        this.earliestDate = earliestDate;
        this.latestDate = latestDate;
    }

    @XmlElement(name = "description")
    private String description;
    @XmlElement(name = "earliestdate")
    private Date earliestDate;
    @XmlElement(name = "latestdate")
    private Date latestDate;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEarliestDate() {
        return earliestDate;
    }

    public void setEarliestDate(Date earliestDate) {
        this.earliestDate = earliestDate;
    }

    public Date getLatestDate() {
        return latestDate;
    }

    public void setLatestDate(Date latestDate) {
        this.latestDate = latestDate;
    }
}
