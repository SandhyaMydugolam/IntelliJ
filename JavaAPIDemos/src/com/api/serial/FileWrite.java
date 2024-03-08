package com.api.serial;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        //create an obect for converting bytes to characters
        InputStreamReader iReader = new InputStreamReader(System.in);
        //create an object of bufferReader
        BufferedReader bufferedReader = new BufferedReader(iReader);
        FileOutputStream fileOutputStream = null;

       
        try {
             fileOutputStream = new FileOutputStream("demo.txt");
            char c = (char) bufferedReader.read();
            while (c!='q') {
                System.out.print(c);
                fileOutputStream.write(c);
                c = (char) bufferedReader.read();
            }
        } catch (IOException e) {
            //TODO AUTO generated catch block
            e.printStackTrace();
        }finally {
            try {
                if(fileOutputStream!=null)
                fileOutputStream.close(); 
            } catch (IOException e){
                
            }
            
        }

    }
}
