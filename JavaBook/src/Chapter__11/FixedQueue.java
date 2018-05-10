package Chapter__11;

import Chapter_9.*;


class FixedQueue implements ICharQ {
    
    private char[] q; //array for holding queue
    
    private int putloc,getloc;//indecies for queue
    
    private boolean inUse; // Used for synchronization    
    
    public FixedQueue(int size){
        q = new char[size];
        putloc=getloc=0;
        inUse = false;
    }
    

    @Override
    synchronized public void put(char ch) throws QueueFullException{
        while(inUse){
            try{wait();}
            catch(InterruptedException ex){}
        }
        
        inUse = true;
        if(putloc == q.length)
            throw new QueueFullException(q.length);
        q[putloc++] = ch;
        inUse = false;
        notify();
    }

    @Override
    synchronized public char get() throws QueueEmptyException{
        while(inUse){
            try{wait();}
            catch(InterruptedException ex){}
        }
        inUse = true;
        if(getloc==putloc){
            throw new QueueEmptyException();
        }
        inUse = false;
        notify();
        return q[getloc++];
    }
    
}
