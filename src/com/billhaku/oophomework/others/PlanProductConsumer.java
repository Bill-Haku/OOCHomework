package com.billhaku.oophomework.others;

import com.billhaku.oophomework.products.PlanProducts;
import com.billhaku.oophomework.products.Product;

public class PlanProductConsumer extends Consumer {
    @Override
    public void consume() {
        PlanProducts planProducts = WareHouse.withdrawPlanProduct();
        System.out.println("Took out a plan product. Area:" + planProducts.area());
    }
}
