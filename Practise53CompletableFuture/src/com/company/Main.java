package com.company;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture
                .supplyAsync(() -> "Hi", Executors.newCachedThreadPool());
    }
}
