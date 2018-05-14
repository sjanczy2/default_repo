package Chapter__13;

//Dyanmic Queue that resizes when full
class DynamicQueue<T> implements IGenQ<T>{
    private T[] q;
    private int getloc, putloc;
    
    DynamicQueue(T[] aRef){
        q = aRef;
        getloc = putloc = 0;
    }
    
    //Puts an item into queue. If full, creates new array 
    //double original size
    @Override
    public void put(T ch){
        if(putloc == q.length){
            //T[] temp = new T[q.length * 2];
        }
    }
    
    public T get(){
        return q[0];
    }
    
}