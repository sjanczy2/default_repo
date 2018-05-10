
package Chapter__11;


public class UseMain {

    
    public static void main(String[] args) {
        Thread thrd;
        // Get main thread
        thrd = Thread.currentThread();
        
        // Display main thread's name
        System.out.println("Main thread is called " + thrd.getName());
        
        // Display main thread's priority
        System.out.println("Main thread's priority " + thrd.getPriority());
        
        System.out.println();
        
        System.out.println("Setting name and priority\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);
        
        // Display main thread's new name
        System.out.println("Main thread is now called " + thrd.getName());
        
        // Display main thread's new priority
        System.out.println("Main thread's priority is now " + thrd.getPriority());
        
    }

}
