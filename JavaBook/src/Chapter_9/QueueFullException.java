package Chapter_9;


public class QueueFullException extends Exception {
    int size;
    
    public QueueFullException(int s){ size = s; }
    
    @Override
    public String toString(){
        return "\nQueue is full. Maximum size is " + size;
    }
}
