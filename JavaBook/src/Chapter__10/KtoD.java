
package Chapter__10;

import java.io.*;


public class KtoD {

    
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(
                            new InputStreamReader(System.in));
        System.out.println("Enter text ('stop' to quit)");
        
        try(FileWriter fw = new FileWriter("text.txt")){
            do{
                System.out.println(": ");
                str = br.readLine();
                if(str.compareTo("stop")==0) break;
                
                str = str + "\r\n"; //newline
                fw.write(str);
                
            }while(str.compareTo("stop")!= 0);
        }
        catch(IOException ex){
            System.out.println("I/O Exception: " + ex);
        }
        
    }

}
