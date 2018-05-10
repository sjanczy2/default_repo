
package Chapter__10;

import java.io.*;

public class JavaRandomAccessDemo {

    
    public static void main(String[] args) {
        
        double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;
        
        try(RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")){
            //Write values into file
            for(int i = 0; i < data.length; i++){
                raf.writeDouble(data[i]);
            }
            
            //Read back specific values
            raf.seek(0);//Seek to first double
            d = raf.readDouble();
            System.out.println("First value: " + d);
            
            raf.seek(8); //Seek second double
            d= raf.readDouble();
            System.out.println("Second value : " + d);
            
            raf.seek(8 * 3);//Seek fourth double
            d= raf.readDouble();
            System.out.println("Fourth value: " + d);
            System.out.println();
            
            System.out.println("Every other value: ");
            for(int i = 0; i < data.length; i +=2){
                raf.seek(8*i);
                d = raf.readDouble();
                System.out.print(d+ " ");
            }
        }
        catch(IOException ex){
            System.out.println("I/O Error: " + ex);
        }
        
    }

}
