
package Chapter__10;

import java.io.*;


public class ReadLines {

    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                            new InputStreamReader(System.in));
        
        String str;
        
        System.out.println("Enter lines of text, 'stop' to quit");
        do {
            str= br.readLine();
            System.out.println(str);
        }while(!str.equals("stop"));
    }

}
