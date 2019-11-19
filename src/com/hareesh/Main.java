package com.hareesh;

import java.io.*;

public class Main {
    private static int ch;
    public static void main(String[] args) throws IOException {
        DataInputStream dis =new DataInputStream(System.in);
        FileOutputStream fos =new FileOutputStream("hello.txt");
        System.out.println("enter data to strore");
        fos.write(ch);
        fos.close();
        System.out.println("file create");

    }
}
