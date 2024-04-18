package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class InventoryItems {
    public static void items() {

        //arraylist
        ArrayList<Inventory> load = new ArrayList<>();
        load.add(new Inventory("002", "Ball", "Spherical object to play with", 1, 200));

        //user input
        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        while(true) {
            System.out.println("""
                Enter the option to:\s
                1. Add new item
                2. Remove an item
                3. View current inventory
                4. Exit the program""");
            int input = intInput.nextInt();
            switch (input) {
                case 1:

                    System.out.println("Item ID:");
                    String id = stringInput.nextLine();
                    System.out.println("Item Name: ");
                    String name = stringInput.nextLine();
                    System.out.println("Item Description: ");
                    String description = stringInput.nextLine();
                    System.out.println("Item Quantity:");
                    int quantity = intInput.nextInt();
                    System.out.println("Item Price: ");
                    int price = intInput.nextInt();

                    load.add(new Inventory(id, name, description, quantity, price));

                    System.out.println("""
                            Adding...
                            
                            
                            Successfully added.
                            """);
                    break;
                case 2:
                    System.out.println("Enter the ID of the item you wish to delete");
                    String idToRemove = stringInput.nextLine();

                    boolean itemFound = false;
                    for (Inventory itemToDelete : load){
                        if (itemToDelete.getId().equals(idToRemove)){
                            load.remove(itemToDelete);
                            System.out.println("""
                    Deleting item...
                    Item deleted.
                    """);
                            itemFound = true;
                            break;
                        }
                    }

                    if (!itemFound) {
                        System.out.println("Item with the specified ID not found.");
                    }
                    break;
                case 3:
                    for(Inventory item: load) {
                        System.out.println("====================");
                        System.out.println(item);
                        System.out.println("====================");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter valid option");
            }
        }
    }
}