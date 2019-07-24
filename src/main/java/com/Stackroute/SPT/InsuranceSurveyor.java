package com.Stackroute.SPT;

public class InsuranceSurveyor extends Employee {


    public void validatingClaim(Claim freshClaim){

        if(freshClaim.getInsurance()!= null){
            if (freshClaim.getInsurance().getIsAvailable()) {
                freshClaim.setApprovedBySurveyor(true);
            }
        }
        else
            freshClaim.setApprovedBySurveyor(false);
    }

}
