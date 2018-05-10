
package Chapter_3;

import java.io.IOException;


public class Java3Test {

    
    public static void main(String[] args) throws IOException {
        
        char input;
        
        int num_conversions = 0;
        
        System.out.println("Please insert characters: ");
        do{
            input = (char)System.in.read();
            
            if(input >= 'A' && input <= 'Z' ){
                input += 32;
                System.out.print(input);
                num_conversions++;
            }
            else if(input >= 'a' && input <= 'z'){
                input -= 32;
                System.out.print(input);
                num_conversions++;
            }
            else if(input == '\n') System.out.print("\n");
            
            
        }while(input != '.');
        System.out.println(num_conversions + " characters were swapped");
        
    }

}
