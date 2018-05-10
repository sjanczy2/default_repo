package Chapter_8;


class DynQueue implements ICharQ{
    
    private char[] q;
    private int putloc, getloc;
    
    public DynQueue(int size){
       q = new char[size];
       putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if((putloc == getloc)&&(q[getloc] != (char) 0)){
            char t[] = new char[q.length*2];
            
            for(int i =0; i < q.length; i++){
                t[i] = q[i];
                System.out.print(q[i]+ " ");
                
            }
            System.out.println();
            putloc = q.length;
            q=t;
            
            //System.out.println("Queue: " + q + " putloc: " + putloc + " getloc: " + getloc + " size: " + q.length);
        }
        else if (putloc == q.length) putloc=0;
        q[putloc++] = ch;
    }

    @Override
    public char get() {
        if(putloc == getloc && (q[getloc] == (char) 0)){
            System.out.println("\n" +q[getloc]);
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        if(getloc == q.length) getloc =0;
        return q[getloc++];
        
    }

}
