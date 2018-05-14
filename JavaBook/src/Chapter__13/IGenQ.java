package Chapter__13;

//Generic Queue interface
public interface IGenQ<T> {
    
    //Put an item into queue
    void put(T ch) throws QueueFullException;
    
    //Get item from queue
    T get() throws QueueEmptyException;

}