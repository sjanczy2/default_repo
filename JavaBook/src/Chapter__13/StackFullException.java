package Chapter__13;


//Error for full stack
class StackFullException extends Exception{
    private int size;

    StackFullException(int s){
        size = s;
    }

    @Override
    public String toString(){
        return "\nStack is full, max size is: " + size;
    }
}
