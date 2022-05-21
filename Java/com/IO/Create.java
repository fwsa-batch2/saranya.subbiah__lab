package com.IO;
import java.io.*;

public class Create {
    public static void main(String[] args) throws IOException {
        File page = new File("C:\\saranya.subbiah_lab\\Java\\com.IO.java");
        if(page.createNewFile()) {
           System.out.println("File Created");
        }
        else {
            System.out.println("File exists");
        }
    }
}
