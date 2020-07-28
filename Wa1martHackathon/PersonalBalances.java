package com.company;

import java.util.Random;

public class PersonalBalances {

    public void generateMoney()
    {
        if( balance == 0 )
        {
            Random mealPlan = new Random();
            int low = 1;
            int high = 3;
            int result = mealPlan.nextInt(high - low) + low;
            if(result == 1)
            {
                balance = 2070.0;
            }
            else if(result == 2)
            {
                balance = 2399.0;
            }
            else
            {
                balance = 2665.0;
            }
            System.out.println("You have " + balance + " In your account.");
        }
    }
}
