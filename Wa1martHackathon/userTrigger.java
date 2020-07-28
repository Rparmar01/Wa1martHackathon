package com.company;
package noobchain;​
import java.util.Scanner;​
/**
 *
 * @author nimes
 */
public class userTrigger {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is your name?");​
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Hello " + userName);  // Output user input
        System.out.println("We have Pizzas, Burgers, and Salads");
        System.out.println("The Pizza costs $2. The Burger costs $4. The Salad costs $3");

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please select either Pizza, Burger, and/or a Salad off of the food items");
        String foodSelect = myObj2.nextLine();
        if((foodSelect.equals("pizza")) || (foodSelect.equals("Pizza")))
        {
            System.out.println("You selected " + foodSelect + ". The price of the pizza is $2");
        }
        else if((foodSelect.equals("burger")) || (foodSelect.equals("Burger")))
        {
            System.out.println("You selected " + foodSelect + ". The price of the pizza is $2");
        }
        else if((foodSelect.equals("salad")) || (foodSelect.equals("salad")))
        {
            System.out.println("You selected " + foodSelect + ". The price of the pizza is $2");
        }
        else
        {
            System.out.println("Sorry, please input an acceptable choice");
        }​
    }
}

