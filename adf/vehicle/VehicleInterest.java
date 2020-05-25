package model.adf.vehicle;

import org.omg.PortableInterceptor.INACTIVE;

public enum VehicleInterest {
    BUY("buy"),
    LEASE("lease"),
    SELL("sell"),
    TRADE_IN("trade-in"),
    TEST_DRIVE("trest-drive");

    private final String interest;

    private VehicleInterest(String interest){
        this.interest = interest;
    }

    public String getInterest(){
        return interest;
    }
}
