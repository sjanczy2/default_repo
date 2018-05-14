package Chapter__13;


public class GenStack<T> implements IStackGen<T> {

    private int top;
    private T[] s;

    GenStack(T[] aRef){
        s = aRef;
        top = -1;
    }

    @Override
    public void push(T ch) throws StackFullException{
        if(top == s.length)
            throw new StackFullException(s.length);

        if(top < 0 ) top = 0;
        s[top++] = ch;
        if(top == s.length)
            top --;
    }

    @Override
    public T pop() throws StackEmptyException{
        if(top < 0)
            throw new StackEmptyException();
        return s[top--];
    }


}
