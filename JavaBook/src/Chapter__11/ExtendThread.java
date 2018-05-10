
package Chapter__11;


public class ExtendThread{
    
    public static void main(String[] args) {
        System.out.println("Starting main thread");
        
        MyThread mt = new MyThread("Child #1");
        
        mt.start();
        
        for(int i =0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ex){
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Exiting main thread");
    }

}
