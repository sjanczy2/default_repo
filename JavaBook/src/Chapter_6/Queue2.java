package Chapter_6;

public class Queue2 {
    
    private char q[];
    private int putloc, getloc;
    
    Queue2(Queue2 ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        
        for(int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }
    
    Queue2(char a[]){
        putloc = 0;
        getloc = 0;
        q = new char[a.length];
        
        for(int i =0; i < a.length; i++) put(a[i]);
    }
    
    Queue2(int size){
        q = new char[size];
        putloc = getloc = 0;
    }
    
    void put(char ch){
        if(putloc==q.length){
            System.out.println("Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }
    
    char get(){
        if(getloc==putloc){
            System.out.println("Queue is empty.");
            return (char) 0;
        }
        
        return q[getloc++];
    }

}
