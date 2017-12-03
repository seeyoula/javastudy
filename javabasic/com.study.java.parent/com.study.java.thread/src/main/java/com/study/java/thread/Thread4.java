package com.study.java.thread;

/**
 * Created by Administrator on 2017/8/13.
 */
public class Thread4 extends Thread {
    private Thread parent;

    public Thread4(Thread parent) {
        this.parent = parent;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("sub thread is running...");
            long now = System.currentTimeMillis();
            while (System.currentTimeMillis() - now < 2000) {

            }
            parent.interrupt();
        }
    }

    public static void main(String[] args) {
        Thread4 thread = new Thread4(Thread.currentThread());
        thread.start();
        try
        {
            thread.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("parent thread will die.");
        }
    }
}
