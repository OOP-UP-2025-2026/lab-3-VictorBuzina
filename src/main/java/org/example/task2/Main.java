package org.example.task2;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart(10);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));

        System.out.println("Initial cart:");
        System.out.println(cart);

        cart.removeById(3);
        System.out.println("\nAfter removing item with id=3:");
        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println("\n" + bill);
    }
}
