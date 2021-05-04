package com.company;

// To use threading, class mst have implement Runnable interface.
public class ChronometerThread implements Runnable {

    private Thread thread;
    private String threadName;

    public ChronometerThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Thread is creating: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running : " + threadName);

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The thread was interrupted : " + threadName );
            e.printStackTrace();
        }
        System.out.println("Thread has been finished : " + threadName);
    }

    public void start(){
        System.out.println("Thread object is creating...");
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}

