package com.billhaku.oophomework.products;

public class Cuboid extends _3DGraphic {
    public double a;
    public double b;
    public double c;

    @Override
    public double volume() {
        return a * b * c;
    }

    public Cuboid(double ina, double inb, double inc) {
        a = ina;
        b = inb;
        c = inc;
    }
}
