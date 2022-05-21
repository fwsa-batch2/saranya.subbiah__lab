package com.IO;
import java.io.*;

public class Write {
    public static void main(String[] args) throws IOException {
        FileWriter page = new FileWriter("C:\\saranya.subbiah_lab\\Java\\com.IO.java");
        page.write("I am Saranya");
        page.close();
        System.out.println("Written in the file");
    }
}
