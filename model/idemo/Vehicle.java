package model.idemo;

public abstract class Vehicle {

    private int x;
    private int y;
    private String make;
    private double price;

    public Vehicle(int x, int y, String make, double price) {
       this.x = x;
       this.y = y;
       this.make = make;
       this.price = price; 
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public String getmake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    @Override 
    public String toString() {
        return " Vehicle at (" + x + "," + y + ") " +
                make + " $ " + price;
    }

}