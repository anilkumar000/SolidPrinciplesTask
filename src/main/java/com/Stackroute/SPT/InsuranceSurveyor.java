package com.Stackroute.SPT;

public class InsuranceSurveyor extends Employee {


    public void validatingClaim(Claim freshClaim){

        if(freshClaim.getInsuranceToBeClaimed()!= null){
            if (!freshClaim.getInsuranceToBeClaimed().isClaimed()) {
                freshClaim.setApprovedBySurveyor(true);
            }
        }
        else
            freshClaim.setApprovedBySurveyor(false);
    }

}
