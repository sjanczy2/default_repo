package Chapter__13;


//Error for empty stack
class StackEmptyException extends Exception{

    @Override
    public String toString(){
        return "\nStack is empty";
    }
}
