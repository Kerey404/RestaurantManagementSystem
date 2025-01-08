import java.util.Objects;

public class MenuItem extends BaseEntity implements Displayable {
    private String name;
    private double price;

    public MenuItem(int itemId, String name, double price) {
        this.id = itemId;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price must be non-negative!");
        }
    }

    @Override
    public String displayItem() {
        return name + " (ID: " + id + ") - $" + price; // id из BaseEntity
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return id == menuItem.id &&
                Double.compare(menuItem.price, price) == 0 &&
                name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}
