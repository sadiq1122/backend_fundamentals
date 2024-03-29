package org.example.multithreading;


public class BasicMultiThreading {


    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Fetcher fetcher1 = new Fetcher();
        fetcher1.fetch();
        Fetcher fetcher2 = new Fetcher();
        fetcher2.fetch();
        long end = System.currentTimeMillis();
        System.out.println("Time taken by main thread - " + (end - start) / 1000 + "secs");
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