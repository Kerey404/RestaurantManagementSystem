import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order extends BaseEntity {
    private List<MenuItem> items;

    public Order(int orderId) {
        this.id = orderId; // Используем поле id из BaseEntity
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem menuItem) {
        items.add(menuItem);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public List<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + id + // id из BaseEntity
                ", total=" + calculateTotal() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
