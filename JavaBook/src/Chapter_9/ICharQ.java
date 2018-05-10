
package Chapter_9;

public interface ICharQ {
    
    //Put a character into Queue
    void put(char ch) throws QueueFullException;
    
    //Get a character from Queue
    char get() throws QueueEmptyException;
    
}
