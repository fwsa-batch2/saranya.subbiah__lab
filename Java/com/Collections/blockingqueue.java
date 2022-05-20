package com.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class blockingqueue {
 

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> Family = new ArrayBlockingQueue<String>(5);
        Family.put("Subbiah");
        Family.put("Selvi");
        Family.put("Saranya");
        Family.put("Swepna");
        Family.put("SabariVasan");
        System.out.println("Family : " + Family);

        Family.remove("Saranya");
        System.out.println("Family : " + Family);

        Family.put("Saran");
        System.out.println("Family : " + Family);

    }
}
