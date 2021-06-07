package com.avijitmondal.awake;

import java.util.Random;

public class MousePointerDriver implements Runnable {
    private final Random random = new Random();
    private final MousePointer mousePointer;

    MousePointerDriver() {
        mousePointer = new MousePointer(random.nextFloat(), random.nextFloat());
        System.out.println(mousePointer);
    }

    @Override
    public void run() {
        mousePointer.setX(random.nextFloat());
        mousePointer.setY(random.nextFloat());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
