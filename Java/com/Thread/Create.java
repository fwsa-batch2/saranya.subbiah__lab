package com.Thread;

public class Create extends Thread {
    public void run() {
        System.out.println("I am Saran");
    }
public static void main(String[] args) {
    Create a = new Create();
    a.start();
}
}
