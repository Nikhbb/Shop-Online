package app.view;

import app.model.IOrder;

public class OrderView {

    public void printOrderInfo(String productName, int productCount, double productPrice, boolean isDelivery, double total){
        System.out.print("\nYour order INFO:");
        System.out.print(productName + " " + productCount + " units * $" + productPrice);
        System.out.print("is delivery: " + isDelivery);
        System.out.print("TOTAL: " + total);
    }
}
