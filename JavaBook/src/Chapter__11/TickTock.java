package Chapter__11;


public class TickTock {
    
    String state;
    
    synchronized void tick(boolean running){
        if(!running){//stop the clock
            state ="ticked";
            notify();
            return;
        }
        
        System.out.print("tick");
        
        state = "ticked";
        
        notify(); //Pass control to tock
        try{
            while(!state.equals("tocked"))
                wait();//Wait for tock to finish
        }
        catch(InterruptedException ex){
            System.out.println(ex);
        }
    }
    
    synchronized void tock(boolean running){
        if(!running){//stop the clock
            state ="tocked";
            notify();
            return;
        }
        
        System.out.print("tocked");
        
        state = "tocked";
        
        notify(); //Pass control to tock
        try{
            while(!state.equals("ticked"))
                wait();//Wait for tock to finish
        }
        catch(InterruptedException ex){
            System.out.println(ex);
        }
    }

    
}
