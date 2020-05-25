package model.adf.vehicle;

public enum FinanceMethod {

    LEASE("lease"),
    FINANCE("finance");

    private final String method;

    private FinanceMethod(String method){
        this.method = method;
    }

    public String getMethod(){
        return method;
    }
}
