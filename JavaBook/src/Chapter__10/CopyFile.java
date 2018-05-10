
package Chapter__10;

import java.io.*;

public class CopyFile {

    
    public static void main(String[] args){
        FileInputStream filein = null;
        FileOutputStream fileout = null;
        int currByte;
        try{
            filein = new FileInputStream("/Users/stevenjanczy/Documents/Notes/Java/JavaBook/src/Chapter__10/myfile.txt");
            fileout = new FileOutputStream("/Users/stevenjanczy/Documents/Notes/Java/JavaBook/src/Chapter__10/copyfile.txt");
            do{
                currByte = filein.read();
                if(currByte == ' ') currByte = '-';
                fileout.write(currByte);
            }while(currByte != -1);
        }
        catch(IOException ex){
            System.out.println("File Error: " + ex);
        }
        finally{
            try{
                if(filein != null) filein.close();
                if(fileout != null) fileout.close();
            }
            catch(IOException ex){
                System.out.println("Error closing file");
            }
        }
        
    }

}
