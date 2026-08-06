package model;

public class Order {
    private int id;
    private String customerName;
    private double total;

    public Order() {
    }

    public Order(int id, String customerName, double total) {
        this.id = id;
        this.customerName = customerName;
        this.total = total;
    }

    public Order(String customerName, double total) {
        this.customerName = customerName;
        this.total = total;
    }

    // getter và setter
}