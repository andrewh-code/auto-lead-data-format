package model.adf.vehicle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="colorcombination")
@XmlAccessorType(XmlAccessType.FIELD)
public class ColorCombination {

    // if color is provided, at least one of them should be provided

    public ColorCombination(){}

    public ColorCombination(String intercolor, String exteriorcolor, String preference) {
        this.intercolor = intercolor;
        this.exteriorcolor = exteriorcolor;
        this.preference = preference;
    }

    @XmlElement(name = "intercolor")
    private String intercolor;

    @XmlElement(name = "exteriorcolor")
    private String exteriorcolor;

    @XmlElement(name = "preference")
    private String preference;

    public String getIntercolor() {
        return intercolor;
    }

    public void setIntercolor(String intercolor) {
        this.intercolor = intercolor;
    }

    public String getExteriorcolor() {
        return exteriorcolor;
    }

    public void setExteriorcolor(String exteriorcolor) {
        this.exteriorcolor = exteriorcolor;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }
}
