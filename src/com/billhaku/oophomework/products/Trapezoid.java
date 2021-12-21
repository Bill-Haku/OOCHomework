package com.billhaku.oophomework.products;

public class Trapezoid extends PlanProducts {
    public double a;
    public double b;
    public double h;

    @Override
    public double area() {
        return (a + b) * h / 2;
    }

    public Trapezoid(double ina, double inb, double inh) {
        a = ina;
        b = inb;
        h = inh;
    }
}
