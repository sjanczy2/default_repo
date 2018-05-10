
package Chapter__12;

enum TrafficLightColor{
    RED, GREEN, YELLOW
}

class TrafficLightSimulator implements Runnable{
    private TrafficLightColor tlc; //holds the color
    private boolean stop = false; //stops simulation when true
    private boolean changed = false;//true when light has changed
    
    TrafficLightSimulator(TrafficLightColor init){
        tlc = init;
    }
    
    TrafficLightSimulator(){
        tlc = TrafficLightColor.RED;
    }
    
    //Begin running light
    @Override
    public void run() {
        while(!stop){
            try{
                switch(tlc){
                    case GREEN:
                        Thread.sleep(10000); //green for 10 seconds
                        break;
                    case YELLOW:
                        Thread.sleep(2000); //yellow for 2 seconds
                        break;
                    case RED:
                        Thread.sleep(12000); //red for 12 seconds
                        break;
                }
            } catch(InterruptedException ex){
                System.out.println(ex);
            }
            changeColor();          
        }
    }
    
    //Change to the next color
    synchronized void changeColor(){
        switch(tlc){
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
        }
        changed = true;
        notify(); // Signal that a light has been changed
    }
    
    //Wait for a light change to occur
    synchronized void waitForChange(){
        try{
            while(!changed)
                wait(); // wait for light to change
            changed = false;
        } catch(InterruptedException ex){
            System.out.println(ex);
        }       
    }
    
    synchronized TrafficLightColor getColor(){
        return tlc;
    }
    
    synchronized void cancel(){
        stop = true;
    }
        
}    
    


public class TrafficLightDemo {

    
    public static void main(String[] args) {
        TrafficLightSimulator t1 =new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thrd = new Thread(t1);
        thrd.start();
        
        for(int i=0; i < 9; i++){
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        
        t1.cancel();
    }

}
