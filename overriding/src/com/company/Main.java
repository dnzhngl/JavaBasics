package com.company;

public class Main {

    public static void main(String[] args) {
        InstructorCreditManager instructorCreditManager = new InstructorCreditManager();
        // System.out.println(instructorCreditManager.Calculate(100));

        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new InstructorCreditManager(), new FarmCreditManager(), new StudentCreditManager()};
        for(BaseCreditManager creditManager : creditManagers){
            double result = creditManager.calculate(1000);
            System.out.println(result);
        }
    }
}
