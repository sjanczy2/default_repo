package Chapter__13;

//Demonstrate Generic Queue
public class GenQueueDemo{

    public static void main(String args[]){
        //Test Integer Queue
        /*
        Integer iStore[] = new Integer[10];
        
        //Create Integer queue from Integer array
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);
        
        Integer iVal;
        
        System.out.println("Demonstrate Integer Queue");
        
        try{
            for(int i =0; i < 5; i++){
                System.out.println("Adding " + i + " to queue");
                q.put(i);
            }
        } catch(QueueFullException ex){
            System.out.println(ex);
        }
        System.out.println();
        
        try{
            for(int i =0; i < 5; i++){
                System.out.print("Getting next integer from queue: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch(QueueEmptyException ex){
            System.out.println(ex);
        }
        
        System.out.println();
        
        Double dStore[] = new Double[10];
        GenQueue<Double> dq = new GenQueue<Double>(dStore);
        
        System.out.println("Double queue");
        try{
            
            for(int d = 0; d < 10; d++){
                System.out.println("Putting value into queue: " + d);
                dq.put((double) d);
            }
        } catch(QueueFullException ex){
            System.out.println(ex);
        }
        */
        
        //Circular Queue Test
        Integer iStore[] = new Integer[5];
        
        //Create Integer queue from Integer array
        CircularQueue<Integer> q = new CircularQueue<Integer>(iStore);
        
        Integer iVal;
        
        System.out.println("Demonstrate Integer Queue");
        
        try{
            for(int i =0; i < 6; i++){
                System.out.println("Adding " + i + " to queue");
                q.put(i);
            }
        } catch(QueueFullException ex){
            System.out.println(ex);
        }
        System.out.println();
        
        try{
            for(int i =0; i < 3; i++){
                System.out.print("Getting next integer from queue: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch(QueueEmptyException ex){
            System.out.println(ex);
        }
        
        try{
            for(int i =0; i < 4; i++){
                System.out.println("Adding " + i + " to queue");
                q.put(i);
            }
        } catch(QueueFullException ex){
            System.out.println(ex);
        }
        
        try{
            for(int i =0; i < 7; i++){
                System.out.print("Getting next integer from queue: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch(QueueEmptyException ex){
            System.out.println(ex);
        }
    }
}