public class RestaurantManagementSystem {
    public static void main(String[] args) {

        Restaurant myRestaurant = new Restaurant("Gourmet Food");


        MenuItem pizza = new MenuItem(1, "Pizza", 12.99);
        MenuItem burger = new MenuItem(2, "Burger", 8.99);
        MenuItem pasta = new MenuItem(3, "Pasta", 10.99);

        myRestaurant.addMenuItem(pizza);
        myRestaurant.addMenuItem(burger);
        myRestaurant.addMenuItem(pasta);

        System.out.println(myRestaurant.displayMenu());

        Order order1 = new Order(101);
        order1.addItem(pizza);
        order1.addItem(burger);

        myRestaurant.createOrder(order1);

        Order order2 = new Order(102);
        order2.addItem(pasta);
        order2.addItem(burger);

        myRestaurant.createOrder(order2);

        System.out.println(myRestaurant.displayOrders());
    }
}