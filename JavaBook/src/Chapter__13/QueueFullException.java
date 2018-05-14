package Chapter__13;

//Exception for Full Queues
public class QueueFullException extends Exception{
    private int size;

    QueueFullException(int s ) {size = s; }

    @Override
    public String toString(){
        return "\nQueue is Full. Max size is: " + size;
    }
}
