
class TickTock {
    
    String state;
    
    synchronized void tick(boolean running){
        if(!running){//stop the clock
            state ="ticked";
            notify();
            return;
        }
        
        System.out.print("tick ");
        
        state = "ticked";
        try{
            Thread.sleep(500);
        }catch(InterruptedException ex){
            
        }
        
        
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
        
        System.out.println("tocked");
        
        state = "tocked";
        try{
            Thread.sleep(500);
        }catch(InterruptedException ex){
            
        }
        
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

class MyThread implements Runnable{
    Thread thrd;
    TickTock ttOb;
    
    MyThread(String name, TickTock tt){
        thrd = new Thread(this,name);
        ttOb = tt;
    }
    
    public static MyThread createAndStart(String name, TickTock tt){
        MyThread myt = new MyThread(name, tt);
        myt.thrd.start();
        return myt;
    }
    
    @Override
    public void run() {
        if(thrd.getName().equals("Tick")){
            for(int i = 0; i<5; i++) ttOb.tick(true);
            ttOb.tick(false);
        }
        else{
            for(int i = 0; i<5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    
    }
}

class ThreadCom{
    public static void main(String args[]){
        TickTock tt = new TickTock();
        MyThread mt1 = MyThread.createAndStart("Tick", tt);
        MyThread mt2 = MyThread.createAndStart("Tock", tt);
        try{
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException ex){
            System.out.println("Main thread interrupted");
        }
    }    
}
