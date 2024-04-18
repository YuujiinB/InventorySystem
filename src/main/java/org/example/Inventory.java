package org.example;

public class Inventory {
    private String id;
    private String itemName;
    private String itemDescription;
    private int itemQuantity;
    private int itemPrice;

    public Inventory(String id, String itemName, String itemDescription, int itemQuantity, int itemPrice){
        this.id = id;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public String viewData(){
        return
                "Item ID: " + id + "\n" +
                        "Item Name: " + itemName + "\n" +
                        "Item Description: " + itemDescription + "\n" +
                        "Item Quantity: " + itemQuantity + "\n" +
                        "Item Price: " + itemPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
