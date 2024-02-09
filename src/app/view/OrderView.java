package app.view;

import app.model.IOrder;

import java.util.Scanner;

public class OrderView {

    public String[] inputValue(){
        String [] order = new String[4];
        Scanner sc = new Scanner(System.in);

        System.out.print("Input product name: ");
        order[0] = sc.nextLine();
        System.out.print("Input product price: ");
        order[1] = sc.nextLine();
        System.out.print("Input product count: ");
        order[2] = sc.nextLine();
        System.out.print("Input need delivery (true/false): ");
        order[3] = sc.nextLine();

        return order;
    }

    public void printOrderInfo(String[] orderInfo){
        String productName = orderInfo[0];
        String productPrice = orderInfo[1];
        String productCount = orderInfo[2];
        String isDelivery = orderInfo[3];
        String orderSum = orderInfo[4];

        System.out.println("\nYour order INFO:");
        System.out.println(productName + " " + productCount + " unit(s) * $" + productPrice);
        System.out.println("is delivery: " + isDelivery);
        System.out.println("TOTAL: " + orderSum);
    }
}
