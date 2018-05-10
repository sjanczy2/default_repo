
package Chapter_4;

import java.io.IOException;


public class MainHelp {

    
    public static void main(String[] args) throws IOException {
        
        char choice, ignore;
        HelpClassDemo helpobj = new HelpClassDemo();
        
        for(;;){
            do{
                helpobj.showMenu();
                
                choice = (char) System.in.read();
                
                do{
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            }while(!helpobj.isValid(choice));
            
            if(choice == 'q') break;
            
            System.out.println("\n");
            helpobj.helpOn(choice);
        }
    }

}
