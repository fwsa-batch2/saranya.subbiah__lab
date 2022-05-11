package com.ExceptionHandling;

import java.io.IOException;




public class Throw {
    
        public static void fileFind() throws IOException {
             throw new IOException("File Missed");
        }

        public static void main(String[] args) {
            try {
              fileFind();
              System.out.println("Throws Block");  
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }
    }

