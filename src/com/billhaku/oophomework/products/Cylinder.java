package com.billhaku.oophomework.products;

public class Cylinder extends _3DGraphic {
    final double pi = 3.1415926;
    public double r;
    public double h;

    @Override
    public double volume() {
        return pi * r * r * h;
    }

    public Cylinder(double inr, double inh) {
        r = inr;
        h = inh;
    }
}
