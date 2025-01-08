import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Restaurant {
    private String name;
    private List<MenuItem> menu;
    private List<Order> orders;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

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
            ordersDetails.append(order.toString()).append("\n\n");
        }
        return ordersDetails.toString();
    }

    public List<MenuItem> filterMenuItemsByPrice(double maxPrice) {
        return menu.stream()
                .filter(item -> item.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public MenuItem findMenuItemByName(String name) {
        return menu.stream()
                .filter(item -> item.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public List<MenuItem> sortMenuByPrice() {
        return menu.stream()
                .sorted(Comparator.comparingDouble(MenuItem::getPrice))
                .collect(Collectors.toList());
    }
}
