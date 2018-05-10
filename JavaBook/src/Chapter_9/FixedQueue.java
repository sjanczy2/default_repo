package Chapter_9;


class FixedQueue implements ICharQ {
    
    private char[] q; //array for holding queue
    
    private int putloc,getloc;//indecies for queue
    
    public FixedQueue(int size){
        q = new char[size];
        putloc=getloc=0;
    }
    

    public void put(char ch) throws QueueFullException{       
            if(putloc == q.length)
                throw new QueueFullException(q.length);
            q[putloc++] = ch;
        
    }

    @Override
    public char get() throws QueueEmptyException{
        if(getloc==putloc){
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
    
}
