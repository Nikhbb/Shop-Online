package app.model;

public class OrderWithoutDelivery extends Order {
    @Override
    public double orderCalculate(double price, int count) {
        return Math.round(price * count * 100) / 100;
    }
}
