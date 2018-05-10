

package Chapter_8;

import java.util.Queue;

class IQDemo {

    
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        
        ICharQ iQ;
        
        char ch;
        int i;
        
        /*
        iQ = q1;
        for(i=0;i<10;i++)
            iQ.put((char)('A' + i));
        
        
        System.out.print("Fixed Queue: ");
        for(i=0;i<10;i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        
        iQ = q3;
        for(i=0;i<10;i++)
            iQ.put((char)('A' + i));
            
        System.out.print("Circular Queue: ");
        for(i=0;i<10;i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        
        System.out.println("Big Loop for circle");
        for(i=0;i<20;i++){
            iQ.put((char)('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }*/
        
        iQ = q2;
        for(i=0;i<5;i++)
            iQ.put((char)('Z' - i));
        
        System.out.print("Dynamic Queue before expansion: ");
        for(i=0;i<2;i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        for(i=0;i<10;i++)
            iQ.put((char)('A' + i));
        
        System.out.print("Dynamic Queue: ");
        for(i=0;i<10;i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
    }

}
