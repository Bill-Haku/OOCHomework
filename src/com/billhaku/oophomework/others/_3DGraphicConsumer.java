package com.billhaku.oophomework.others;

import com.billhaku.oophomework.products.Product;
import com.billhaku.oophomework.products._3DGraphic;

public class _3DGraphicConsumer extends Consumer {
    @Override
    public void consume() {
        _3DGraphic _3dgraphic = WareHouse.withdraw3DProduct();
        System.out.println("Took out a 3D graphic product. Volume:" + _3dgraphic.volume());
    }
}
