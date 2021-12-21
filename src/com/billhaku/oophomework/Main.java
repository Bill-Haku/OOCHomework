package com.billhaku.oophomework;

import com.billhaku.oophomework.others.PlanProductConsumer;
import com.billhaku.oophomework.others.PlanProductProducer;
import com.billhaku.oophomework.others._3DGraphicConsumer;
import com.billhaku.oophomework.others._3DGraphicProducer;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	    Thread produce = new Thread(new StartProduce());
        produce.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread consume = new Thread(new startConsume());
        consume.start();
    }
}

class StartProduce implements Runnable {
    @Override
    public void run() {
        PlanProductProducer planProductProducer = new PlanProductProducer();
        _3DGraphicProducer _3dGraphicProducer = new _3DGraphicProducer();

        while(true) {
            planProductProducer.build();
            _3dGraphicProducer.build();
            try {
                TimeUnit.SECONDS.sleep((long) (Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class startConsume implements Runnable {
    @Override
    public void run() {
        PlanProductConsumer planProductConsumer = new PlanProductConsumer();
        _3DGraphicConsumer _3dGraphicConsumer = new _3DGraphicConsumer();

        while(true) {
            planProductConsumer.consume();
            _3dGraphicConsumer.consume();
            try {
                TimeUnit.SECONDS.sleep((long) (Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}