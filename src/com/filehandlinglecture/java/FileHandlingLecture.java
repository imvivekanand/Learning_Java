package com.filehandlinglecture.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingLecture {
    public static void main(String[] args){
        String data = "I love India";

        //Write Data
        try {
            FileOutputStream fos = new FileOutputStream("myFile.txt");
            byte[] byteData = data.getBytes();
            fos.write(byteData);
            fos.close();
        } catch (IOException ex){
            System.out.println(ex);
        }

        //Read Data
        try{
        FileInputStream fis = new FileInputStream("myFile.txt");
        int i=0;
        while ((i= fis.read()) != -1){
            System.out.print((char) i);
        }
        fis.close();
        } catch (IOException x){
            System.out.println(x);
        }
    }
}
