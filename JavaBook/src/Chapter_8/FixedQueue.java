package Chapter_8;


class FixedQueue implements ICharQ {
    
    private char[] q; //array for holding queue
    
    private int putloc,getloc;//indecies for queue
    
    public FixedQueue(int size){
        q = new char[size];
        putloc=getloc=0;
    }
    

    @Override
    public void put(char ch) {
        if(putloc == q.length){
            System.out.println("- Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    @Override
    public char get() {
        if(getloc==putloc){
            System.out.println("- Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }
    
}
