package com.Stackroute.SPT;

public class ClaimManager extends Employee {
    public void approvingClaim(Claim freshClaim){

        if(freshClaim.getInsuranceToBeClaimed()!= null){
            if (!freshClaim.getInsuranceToBeClaimed().isClaimed()) {
                freshClaim.setApprovedByManager(true);
            }
        }
        else
            freshClaim.setApprovedBySurveyor(false);
    }
}
