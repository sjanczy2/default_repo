package Chapter__10;

import java.io.*;
public class Help {
    String helpfile;
    
    Help(String fname){
        helpfile = fname;
    }
    
    boolean helpOn(String what){
        int ch;
        String topic, info;
        
        //First, open file
        try(BufferedReader helpReader = new BufferedReader(new FileReader(helpfile))){
            do{
                //Read characters until we find a #
                ch = helpReader.read();
                
                //Check if this is right topic
                if(ch == '#'){
                    topic = helpReader.readLine();
                    if(what.compareTo(topic) == 0){ //Topic found
                        do{
                            info = helpReader.readLine();
                            if(info != null) System.out.println(info);
                        }while((info != null) && (info.compareTo("") != 0));
                        return true;
                    }                   
                }
                
            }while(ch != -1);
        }
        catch(IOException ex){
            System.out.println("Error accessing help file");
            return false;
        }
        return false; // No matching topic
    }
    
    //Get a Help Topic
    String getSelection(){
        String topic = "";
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a topic: ");
        try{
            topic = br.readLine();
        }
        catch(IOException ex){
            System.out.println("Error reading console");
        }
        return topic;
    }
}
