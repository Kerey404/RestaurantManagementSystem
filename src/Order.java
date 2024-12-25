import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<MenuItem> items;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void addItem(MenuItem menuItem) {
        items.add(menuItem);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public String displayOrder() {
        StringBuilder orderDetails = new StringBuilder("Order ID: " + orderId + "\nItems:\n");
        for (MenuItem item : items) {
            orderDetails.append("  - ").append(item.displayItem()).append("\n");
        }
        orderDetails.append("Total: $").append(calculateTotal());
        return orderDetails.toString();
    }
}