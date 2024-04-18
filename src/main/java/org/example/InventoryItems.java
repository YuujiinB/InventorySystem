package org.example;
import java.util.Scanner;

public class InventoryItems {
    public static void items (){

        //user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("1. add 2. del 3. exit");
        int input = userInput.nextInt();
        switch (input){
            case 1:
                System.out.println("add");
                break;
            case 2:
                System.out.println("del");
                break;
            case 3:
                new Main();
                break;
            default:
                System.out.println("Enter valid option");
        }
    }
}

