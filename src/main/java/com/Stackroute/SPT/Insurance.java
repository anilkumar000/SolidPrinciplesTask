package com.Stackroute.SPT;

public class Insurance {
    private int insuranceId;
    private int custId;
    private double premiumAmount;
    private boolean isEligible;
    private boolean isClaimed;


    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public boolean isEligible() {
        return isEligible;
    }

    public void setEligible(boolean eligible) {
        isEligible = eligible;
    }

    public boolean isClaimed() {
        return isClaimed;
    }

    public void setClaimed(boolean claimed) {
        isClaimed = claimed;
    }



    public Insurance(int insuranceId, int custId,boolean isClaimed) {
        this.insuranceId = insuranceId;
        this.custId = custId;
        this.isClaimed = isClaimed;
    }

}

