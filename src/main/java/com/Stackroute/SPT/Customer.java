package com.Stackroute.SPT;

public class Customer {
    private int custId;
    private String custName;
    private Insurance insurance;


    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }



    public Customer(int custId, String custName,String typeOfInsurance) {
        this.custId = custId;
        this.custName = custName;
        this.insurance=new Insurance(getCustId(),getCustId(),typeOfInsurance);
    }


    public Claim raisingClaim(){
        Claim freshClaim=new Claim(getInsurance());
        return freshClaim;

    }
}
