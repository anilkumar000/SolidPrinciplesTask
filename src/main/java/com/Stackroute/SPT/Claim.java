package com.Stackroute.SPT;

public class Claim {
    private int claimId;
    private Insurance insuranceToBeClaimed;
    private Boolean isApprovedBySurveyor=false;
    private Boolean isApprovedByManager=false;


    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public Insurance getInsuranceToBeClaimed() {
        return insuranceToBeClaimed;
    }

    public void setInsuranceToBeClaimed(Insurance insuranceToBeClaimed) {
        this.insuranceToBeClaimed = insuranceToBeClaimed;
    }


    public Boolean getApprovedBySurveyor() {
        return isApprovedBySurveyor;
    }

    public void setApprovedBySurveyor(Boolean approvedBySurveyor) {
        isApprovedBySurveyor = approvedBySurveyor;
    }

    public Boolean getApprovedByManager() {
        return isApprovedByManager;
    }

    public void setApprovedByManager(Boolean approvedByManager) {
        isApprovedByManager = approvedByManager;
    }



    public Claim(Insurance insuranceOfCustomer) {
        this.insuranceToBeClaimed = insuranceOfCustomer;
    }
}
