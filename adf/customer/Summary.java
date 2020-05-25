package model.adf.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="summary")
@XmlAccessorType(XmlAccessType.FIELD)
public class Summary {


    public Summary() {
    }

    public Summary(String summary) {
        this.summary = summary;
    }

    @XmlElement(name = "summary")
    private String summary;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
