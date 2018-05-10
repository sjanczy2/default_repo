package Chapter_6;


public class Stack {
    
    private int index, top;
    private char ch[];
    
    Stack(int size){
        ch = new char[size];
        top = ch.length-1;
        index = 0;
    }
    
    void push(char input){
        if(index > top){
            System.out.println("Stack is Full.");
            return;
        }
        if(index < 0) index = 0;
        ch[index++] = input;
        
    }
    
    char pop(){
        if(index < 0){
            System.out.println("Stack is Empty.");
            return (char) 45;
        }
        if(index > top) index = top;
        System.out.println(ch[index]);
        return ch[index--];
    }
    
    void printStack(){
        for(char che:ch)
            System.out.print(che);
        System.out.println();
    }
    

}
