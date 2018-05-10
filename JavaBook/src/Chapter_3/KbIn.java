package Chapter_3;

import java.io.IOException;


public class KbIn {
    
    public static void main(String args[]) throws IOException{
        
        char ch;
        System.out.println("Enter a Key: ");
        ch = (char) System.in.read();
        
        System.out.println("Key: " + ch);
        
    }

}
