
package Chapter__11;

class MyThreadd implements Runnable{
    Thread thrd; 
    
    MyThreadd(String name){
        thrd = new Thread(this,name);
    }
    
    public static MyThreadd createAndStart(String name){
        MyThreadd myt = new MyThreadd(name);
        myt.thrd.start();
        return myt;
    }
    
    @Override
    public void run() {
        System.out.println(thrd.getName() +" starting");
        try{
            for(int count =0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        }
        catch(InterruptedException ex){
            System.out.println(thrd.getName()+ " interrupted");
        }
        System.out.println(thrd.getName()+ " terminating");
    }
    
}


public class MoreThreads {

    
    public static void main(String[] args) {
        System.out.println("Starting main thread");
        
        MyThreadd mt1 = MyThreadd.createAndStart("Child #1");
        MyThreadd mt2 = MyThreadd.createAndStart("Child #2");
        MyThreadd mt3 = MyThreadd.createAndStart("Child #3");
        
        for(int i=0; i<50; i++){
            System.out.println(".");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ex){
                System.out.println("oops");
            }
        }
        System.out.println("Main thread kill");
    }

}
