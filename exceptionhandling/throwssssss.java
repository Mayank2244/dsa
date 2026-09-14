// declare exception that a method throw,
// and inform caller to handle the problem
// it is mainly used with check exception
// if a method call another method that throws is a checked exception
//
package exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class throwssssss {
    static void readfile(String Filename) throws IOException {
        try(FileReader file=new FileReader(Filename)){
            int data;
            while((data=file.read())!=-1){
                System.out.println((char)data);
            }
        }

    }
    public static void main(String[] args) {
       try {
           readfile("test.txt");
       }
       catch (IOException e){
           System.out.println("file not found"+e.getMessage());
       }
        System.out.println("program continue after this");
    }
}
