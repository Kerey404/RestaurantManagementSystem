public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant("Gourmet Food");

        MenuItem pizza = new MenuItem(1, "Pizza", 12.99);
        MenuItem burger = new MenuItem(2, "Burger", 8.99);
        MenuItem pasta = new MenuItem(3, "Pasta", 10.99);

        myRestaurant.addMenuItem(pizza);
        myRestaurant.addMenuItem(burger);
        myRestaurant.addMenuItem(pasta);

        System.out.println("Menu:");
        System.out.println(myRestaurant.displayMenu());

        System.out.println("Filtered Menu (<= $10):");
        myRestaurant.filterMenuItemsByPrice(10).forEach(System.out::println);

        System.out.println("Sorted Menu by Price:");
        myRestaurant.sortMenuByPrice().forEach(System.out::println);

        MenuItem foundItem = myRestaurant.findMenuItemByName("Pizza");
        System.out.println("Found Item: " + (foundItem != null ? foundItem : "Not Found"));

        Order order = new Order(101);
        order.addItem(pizza);
        order.addItem(burger);

        myRestaurant.createOrder(order);
        System.out.println("Orders:");
        System.out.println(myRestaurant.displayOrders());
    }
}
