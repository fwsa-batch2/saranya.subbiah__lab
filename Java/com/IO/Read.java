package com.IO;
import java.io.*;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws IOException {
        File page = new File("C:\\saranya.subbiah_lab\\Java\\com.IO.java");
        try (Scanner scan = new Scanner(page)) {
            while(scan.hasNextLine()) {
                System.out.println(scan.hasNextLine());
            }
        }
    }
}
