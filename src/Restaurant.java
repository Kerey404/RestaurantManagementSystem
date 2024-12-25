
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    private String name;
    private List<MenuItem> menu;
    private List<Order> orders;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }


    public String displayMenu() {
        StringBuilder menuDetails = new StringBuilder("Menu of " + name + ":\n");
        for (MenuItem item : menu) {
            menuDetails.append("  - ").append(item.displayItem()).append("\n");
        }
        return menuDetails.toString();
    }

    public void createOrder(Order order) {
        orders.add(order);
    }

    public String displayOrders() {
        StringBuilder ordersDetails = new StringBuilder("Orders in " + name + ":\n");
        for (Order order : orders) {
            ordersDetails.append(order.displayOrder()).append("\n\n");
        }
        return ordersDetails.toString();
    }
}
