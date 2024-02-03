package app.model;

public class OrderWithoutDelivery extends Order {
    @Override
    public double orderCalculate(int count, double price) {
        return Math.round(count * price * 100) / 100;
    }
}
