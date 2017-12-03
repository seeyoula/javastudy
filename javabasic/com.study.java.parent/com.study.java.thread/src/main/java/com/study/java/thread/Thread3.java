package com.study.java.thread;

/**
 * Created by Administrator on 2017/8/13.
 */
public class Thread3 extends Thread {
    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("Some one has interrupted me...");
            } else {
                System.out.println("Going...");
            }
            long now = System.currentTimeMillis();
            while (System.currentTimeMillis() - now < 2000) {

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread3 t = new Thread3();
        t.start();
        Thread.sleep(3000);
        t.interrupt();
    }
}
