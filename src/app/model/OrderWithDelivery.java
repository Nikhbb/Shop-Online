package app.model;

public class OrderWithDelivery extends Order {
    double deliveryPercent = 10;

    @Override
    public double orderCalculate(int count, double price) {
        long orderSum = Math.round(count * price * 100);
        long deliverySum = Math.round(orderSum * 10);
        return (orderSum + deliverySum) / 100;
    }
}
