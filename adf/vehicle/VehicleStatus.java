package model.adf.vehicle;

public enum VehicleStatus {

    NEW("new"),
    USED("used");

    private final String status;

    private VehicleStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}
