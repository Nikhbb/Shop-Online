package app.model;

public class OrderWithoutDelivery implements IOrder {
    @Override
    public double orderCalculate(int count, double price) {
        return Math.round(count * price * 100) / 100;
    }
}
