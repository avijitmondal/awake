package com.avijitmondal.awake;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello from Awake");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new MousePointerDriver());
        executorService.shutdown();
    }
}
