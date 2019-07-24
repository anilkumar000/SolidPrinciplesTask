package com.Stackroute.SPT;

import java.util.Scanner;

public class HealthInsuranceSystem {

    public static void main(String[] args) {
        int custid;
        String custName;
        Boolean custStatus;
        System.out.println("Enter Customer Id:");
        Scanner inputId=new Scanner(System.in);
        custid=inputId.nextInt();
        System.out.println("Enter your Name:");
        Scanner inputName=new Scanner(System.in);
        custName=inputId.next();
        System.out.println("Is your Insurance Claimed:");
        Scanner inputStatus=new Scanner(System.in);
        custStatus=inputId.nextBoolean();
        Customer customer=new Customer(custid,custName,custStatus);
        InsuranceSurveyor insuranceSurveyor=new InsuranceSurveyor();
        ClaimManager claimManager=new ClaimManager();


        insuranceSurveyor.validatingClaim( customer.raisingClaim());
        System.out.println("Is approved by Surveyor: "+customer.freshClaim.getApprovedBySurveyor());
        if (customer.freshClaim.getApprovedBySurveyor()) {
            claimManager.approvingClaim(customer.raisingClaim());
            System.out.println("Is approved by Manager: " + customer.freshClaim.getApprovedBySurveyor());
        }
    }
}
