package app.model;

public class OrderWithDelivery extends Order {
    double deliveryPercent = 10;

    @Override
    public double orderCalculate(double price, int count) {
        long orderSum = Math.round(price * count * 100);
        long deliverySum = Math.round(orderSum * deliveryPercent);
        return (orderSum + deliverySum) / 100 / 10;
    }
}
