package Test2_managementSystem.Past.Calculator;

import java.io.IOException;

public class KeyInput {
    public static void main(String[] args){
        int i;
        System.out.println("input SHI-RO");
        try {
            i = System.in.read();
            System.out.println((char) i);
            System.out.println(i);
        }catch (IOException e){
            System.out.println("error DA-YO");
        }
    }
}
