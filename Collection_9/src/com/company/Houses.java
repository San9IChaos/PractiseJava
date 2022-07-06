package com.company;

import java.util.Objects;

public class Houses implements Comparable<Houses> {
    private String title;
    private int price;

    public Houses(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Houses{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Houses houses = (Houses) o;
        return price == houses.price && Objects.equals(title, houses.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public int compareTo(Houses o) {
        if(this.price > o.getPrice()) {
            return 1;
        }
        else if(this.price < o.getPrice()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
