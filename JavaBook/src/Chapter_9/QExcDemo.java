
package Chapter_9;


public class QExcDemo {

    
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;
        
        try{
            for(i = 0; i < 11; i++){
                System.out.print("Store: " + (char)('A'+i));
                q.put((char)('A' + i));
                System.out.println(" ok");
            }
        }
        catch(QueueFullException ex){
            System.out.println(ex);
        }
        System.out.println();
        
        try{
            for(i = 0; i < 11; i++){
                System.out.print("Next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch(QueueEmptyException ex){
            System.out.println(ex);
        }
    }

}
