package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("Cart capacity must be positive");
        this.contents = new Item[capacity];
        this.index = 0;
    }

    public void add(Item item) {
        if (isFull())
            throw new IllegalStateException("Cart is full!");
        contents[index++] = item;
    }

    public void removeById(long itemId) {
        int foundIndex = findItemIndexById(itemId);
        if (foundIndex == -1)
            return;

        for (int i = foundIndex; i < index - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[--index] = null;
    }

    private int findItemIndexById(long itemId) {
        for (int i = 0; i < index; i++) {
            if (contents[i].getId() == itemId)
                return i;
        }
        return -1;
    }

    public Item[] getItems() {
        return Arrays.copyOf(contents, index);
    }

    public boolean isFull() {
        return index == contents.length;
    }

    public int getSize() {
        return index;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(getItems()) +
                '}';
    }
}

