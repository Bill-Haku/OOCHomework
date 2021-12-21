package com.billhaku.oophomework.products;

public class Trangle extends PlanProducts {
    public double s;
    public double h;

    @Override
    public double area() {
        return s * h / 2;
    }

    public Trangle(double ins, double inh) {
        s = ins;
        h = inh;
    }
}
