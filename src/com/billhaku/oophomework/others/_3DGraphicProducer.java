package com.billhaku.oophomework.others;

import com.billhaku.oophomework.products.Cuboid;
import com.billhaku.oophomework.products.Cylinder;
import com.billhaku.oophomework.products.Sphere;

public class _3DGraphicProducer extends Producer {
    public int producerID;

    @Override
    public void build() {
        final double d = Math.random();
        final int rand = (int) (d * 3);

        switch (rand) {
            case 0:
                Cuboid cuboid = new Cuboid(Math.random() * 10, Math.random() * 10, Math.random() * 10);
                WareHouse.deposit3DProduct(cuboid);
                break;
            case 1:
                Cylinder cylinder = new Cylinder(Math.random() * 10, Math.random() * 10);
                WareHouse.deposit3DProduct(cylinder);
                break;
            case 2:
                Sphere sphere = new Sphere(Math.random() * 10);
                WareHouse.deposit3DProduct(sphere);
                break;
            default:
                break;
        }
    }
}
