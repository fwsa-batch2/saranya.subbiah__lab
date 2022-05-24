package com.Thread;



public class RunnableThread implements Runnable  {
    public void run() {
        System.out.println("I am Saran");
    }
public static void main(String[] args) {
    Thread b = new Thread(new RunnableThread());
    b.start();
}
}
