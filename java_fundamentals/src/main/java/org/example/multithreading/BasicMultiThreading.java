package org.example.multithreading;

public class BasicMultiThreading {

    public static void getDataInSync() throws InterruptedException {
        long start = System.currentTimeMillis();
        Fetcher fetcher1 = new Fetcher();
        fetcher1.fetch();
        Fetcher fetcher2 = new Fetcher();
        fetcher2.fetch();
        long end = System.currentTimeMillis();
        System.out.println("Time taken by main thread - " + (end - start) / 1000 + "secs");
    }

    public static void getDataInAsync() throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread caller = new Thread(() -> {
            Fetcher fetcher1 = new Fetcher();
            try {
                fetcher1.fetch();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread caller2 = new Thread(() -> {
            Fetcher fetcher2 = new Fetcher();
            try {
                fetcher2.fetch();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        caller.start();
        caller2.start();
        long end = System.currentTimeMillis();
        System.out.println("Time taken by main thread - " + (end - start) / 1000 + "secs");
    }

    public static void main(String[] args) throws InterruptedException {
        getDataInAsync();
    }
}


class Fetcher {
    public void fetch() throws InterruptedException {
        String name = Thread.currentThread().getName();
        System.out.println(name + " : Fetching data from remote server");
        Thread.sleep(3000);
        System.out.println(name + " : Fetch Successful");
    }
}