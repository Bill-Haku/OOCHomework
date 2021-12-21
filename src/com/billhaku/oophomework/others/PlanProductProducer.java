package com.billhaku.oophomework.others;

import com.billhaku.oophomework.products.Rectangle;
import com.billhaku.oophomework.products.Trangle;
import com.billhaku.oophomework.products.Trapezoid;

public class PlanProductProducer extends Producer{
    public int producerID;

    @Override
    public void build() {
        final double d = Math.random();
        final int rand = (int) (d * 3);

        switch (rand) {
            case 0:
                Rectangle rectangle = new Rectangle(Math.random() * 10, Math.random() * 10);
                WareHouse.depositPlanProduct(rectangle);
                break;
            case 1:
                Trangle trangle = new Trangle(Math.random() * 10, Math.random() * 10);
                WareHouse.depositPlanProduct(trangle);
                break;
            case 2:
                Trapezoid trapezoid = new Trapezoid(Math.random() * 10, Math.random() * 10, Math.random() * 10);
                WareHouse.depositPlanProduct(trapezoid);
                break;
            default:
                break;
        }
    }
}
