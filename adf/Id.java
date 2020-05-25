package model.adf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="id")
@XmlAccessorType(XmlAccessType.FIELD)
public class Id {

    public Id(){};

    public Id(Integer sequence, String source, String id) {
        this.sequence = sequence;
        this.source = source;
        this.id = id;
    }

    @XmlAttribute(name = "sequence")
    private Integer sequence;

    @XmlAttribute(name = "source")
    private String source;

    @XmlValue
    private String id;

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
