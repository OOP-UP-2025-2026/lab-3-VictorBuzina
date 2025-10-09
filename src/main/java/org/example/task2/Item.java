package org.example.task2;

public class Item {

    private long id;
    private String name;
    private double price;

    public Item(long id, String name, double price) {
        setId(id);
        setName(name);
        setPrice(price);
    }

    private void setId(long id) {
        if (id <= 0)
            throw new IllegalArgumentException("ID must be positive");
        this.id = id;
    }

    private void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    private void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public long getId() { return id; }

    public String getName() { return name; }

    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

