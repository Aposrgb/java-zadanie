
package ru.kamalov.city;

public class Road{
    private String name;
    private int price;
    Road(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    
    
}
