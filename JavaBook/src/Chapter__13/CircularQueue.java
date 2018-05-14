package Chapter__13;

class CircularQueue<T> implements IGenQ<T>{
    
    private T[] q;
    private int putloc, getloc;
    private boolean hasItem; //Used to check between full and empty
    
    //Create new queue
    CircularQueue(T[] aRef){
        q = aRef;
        putloc = getloc = 0;
        hasItem = false;
    }
    
    //Place item into queue
    @Override
    public void put(T ch) 
        throws QueueFullException{
        
        if(putloc == getloc && hasItem){
            throw new QueueFullException(q.length);
        }
        q[putloc++] = ch;
        if(putloc == q.length)
            putloc = 0;
        hasItem = true;
        
    }
    
    //Grab item from queue
    @Override
    public T get()
        throws QueueEmptyException{
        
        if(!hasItem)
            throw new QueueEmptyException();
        
        T val = q[getloc++];
        
        if(getloc == putloc || (getloc==q.length && putloc == 0))
            hasItem = false;
        if(getloc == q.length)
            getloc = 0;
        return val;
    }
    
}