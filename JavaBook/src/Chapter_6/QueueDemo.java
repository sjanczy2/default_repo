
package Chapter_6;


public class QueueDemo {

    
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        
        System.out.println("Using bigQ to store alphabet");
        for(i = 0; i < 26; i++)
            bigQ.put((char)('A' + i));
        
        System.out.println("Contents of bigQ: ");
        for(i = 0; i<26; i++){
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        
        for(i = 0; i <5; i++){
            System.out.println("Attempting to store " + 
                                (char)('Z' - i));
            smallQ.put((char)('Z'-i));
            System.out.println();
        }
        System.out.println();
        
        for(i=0; i <5; i++){
            ch=smallQ.get();
            
            if(ch != (char) 0) System.out.print(ch);
        }
    }

}
