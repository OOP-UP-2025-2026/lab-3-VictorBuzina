package org.example.task2;

public class Order {

    private long id;
    private String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {
        StringBuilder builder = new StringBuilder();
        builder.append("Order #").append(id)
                .append(" for ").append(customer)
                .append("\n--------------------\n");

        double total = 0.0;
        for (Item item : cart.getItems()) {
            builder.append("ID: ").append(item.getId())
                    .append(" | Name: ").append(item.getName())
                    .append(" | Price: ").append(item.getPrice())
                    .append("\n");
            total += item.getPrice();
        }

        builder.append("--------------------\n")
                .append("Total: ").append(total).append(" UAH\n");

        return builder.toString();
    }
}
