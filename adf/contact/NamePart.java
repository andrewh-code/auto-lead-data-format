package model.adf.contact;

public enum NamePart {

    FIRST("first"),
    LAST("last"),
    FULL("full");

    private String namePart;

    NamePart(String namePart){
        this.namePart = namePart;
    }

    public String getNamePart(){
        return namePart;
    }

}
