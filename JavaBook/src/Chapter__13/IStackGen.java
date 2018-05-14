package Chapter__13;

public interface IStackGen<T>{

    //Put an item into stack
    public void push(T ch) throws StackFullException;

    //Retrieve item from stack
    public T pop() throws StackEmptyException;
}
