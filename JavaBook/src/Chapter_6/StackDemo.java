
package Chapter_6;


public class StackDemo {

    
    public static void main(String[] args) {
        
        Stack s = new Stack(7);
        char boop;
        boop = s.pop();
        
        s.push('j');
        s.push('c');
        s.push('a');
        s.push('s');
        s.push('b');
        s.push('n');
        s.push('l');
        s.push('v');
        s.printStack();
        
        boop = s.pop();
        System.out.println(boop);
        s.push('b');
        s.push('q');
        s.printStack();
        
        
    }

}
