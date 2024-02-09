package app.controller;

import app.model.Order;
import app.model.OrderWithDelivery;
import app.model.OrderWithoutDelivery;
import app.view.OrderView;

public class OrderController {
    private OrderView view = new OrderView();

    public void run() {
        Order model;
        String[] orderInfo = new String[5];
        String[] userData = view.inputValue();

        if (userData[3].equals("true")) {
            model = new OrderWithDelivery();
            orderInfo[0] = userData[0];
            orderInfo[1] = userData[1];
            orderInfo[2] = userData[2];
            orderInfo[3] = userData[3];
            orderInfo[4] = String.valueOf(model.orderCalculate(Double.parseDouble(userData[1]), Integer.parseInt(userData[2])));
            view.printOrderInfo(orderInfo);
        } else {
            model = new OrderWithoutDelivery();
            orderInfo[0] = userData[0];
            orderInfo[1] = userData[1];
            orderInfo[2] = userData[2];
            orderInfo[3] = userData[3];
            orderInfo[4] = String.valueOf(model.orderCalculate(Double.parseDouble(userData[1]), Integer.parseInt(userData[2])));
            view.printOrderInfo(orderInfo);
        }
    }
}
