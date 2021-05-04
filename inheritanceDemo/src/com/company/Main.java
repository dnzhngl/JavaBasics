package com.company;

public class Main {

    public static void main(String[] args) {

        FarmCreditManager farmCreditManager = new FarmCreditManager();
        //farmCreditManager.Calculate();

        InstructorCreditManager instructorCreditManager = new InstructorCreditManager();
        //instructorCreditManager.Calculate();

        SoldierCreditManager soldierCreditManager = new SoldierCreditManager();
        //soldierCreditManager.Calculate();

        CreditUI creditUI = new CreditUI();
        creditUI.CreditCalculate(instructorCreditManager);
        creditUI.CreditCalculate(farmCreditManager);
        creditUI.CreditCalculate(soldierCreditManager);
    }
}
