package Chapter__13;

//Generic fixed size queue
class GenQueue<T> implements IGenQ<T>{
    private T q[];
    private int putloc, getloc;
    
    //Construct Empty Queue of type T
    public GenQueue(T[] aRef){
        q = aRef;
        putloc = getloc = 0;
    }
    
    //Put an item into the Queue
    @Override
    public void put(T obj) 
        throws QueueFullException{
            if(putloc == q.length)
                throw new QueueFullException(q.length);
            
            q[putloc++] = obj;
        
    }
    
    //Get an item from the Queue
    @Override
    public T get()
        throws QueueEmptyException{
            if(getloc == putloc)
                throw new QueueEmptyException();
            
            return q[getloc++];
        
        
    }
    
    
}