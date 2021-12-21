package com.billhaku.oophomework.products;

public class Rectangle extends PlanProducts {
    public double a;
    public double b;

    @Override
    public double area() {
        return a*b;
    }

    public Rectangle(double ina, double inb) {
        a = ina;
        b = inb;
    }
}
