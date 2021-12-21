package com.billhaku.oophomework.others;

import com.billhaku.oophomework.products.PlanProducts;
import com.billhaku.oophomework.products._3DGraphic;

import java.util.LinkedList;
import java.util.Queue;

public class WareHouse {
    public static double totalArea = 1000;
    public static double totalVolume = 10000;
    public static double leftArea = 1000;
    public static double leftVolume = 10000;
    public static Queue<PlanProducts> planProductsQueue = new LinkedList<PlanProducts>();
    public static Queue<_3DGraphic> _3DProductQueue = new LinkedList<_3DGraphic>();

    public static void depositPlanProduct(PlanProducts myProduct) {
        leftArea -= myProduct.area();
        planProductsQueue.offer(myProduct);
        System.out.println("Deposited a plan product. Left area:" + leftArea);
    }

    public static void deposit3DProduct(_3DGraphic myProduct) {
        leftVolume -= myProduct.volume();
        _3DProductQueue.offer(myProduct);
        System.out.println("Deposited a 3d graphic. Left volume:" + leftVolume);
    }

    public static PlanProducts withdrawPlanProduct() {
        PlanProducts thisProduct = planProductsQueue.poll();
        assert thisProduct != null;
        leftArea += thisProduct.area();
        return thisProduct;
    }

    public static _3DGraphic withdraw3DProduct() {
        _3DGraphic thisProduct = _3DProductQueue.poll();
        assert thisProduct != null;
        leftVolume += thisProduct.volume();
        return thisProduct;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public double getTotalVolume() {
        return totalVolume;
    }

    public double getLeftArea() {
        return leftArea;
    }

    public double getLeftVolume() {
        return leftVolume;
    }
}
