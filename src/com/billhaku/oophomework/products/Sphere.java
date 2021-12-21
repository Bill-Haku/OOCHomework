package com.billhaku.oophomework.products;

public class Sphere extends _3DGraphic {
    final double pi = 3.1415926;
    public double r;

    @Override
    public double volume() {
        return 4 * pi * r * r * r / 3;
    }

    public Sphere(double inr) {
        r = inr;
    }
}
