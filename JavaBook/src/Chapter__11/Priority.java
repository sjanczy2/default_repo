package Chapter__11;


public class Priority implements Runnable {
    int count;
    Thread thrd;
    
    static boolean stop = false;
    static String currentName;
    
    Priority(String name){
        thrd = new Thread(this,name);
        count = 0;
        currentName = name;
    }
      
    @Override
    public void run() {
        System.out.println(thrd.getName() + " starting");
        do{
            count++;
            
            if(!currentName.equals(thrd.getName())){
                currentName = thrd.getName();
                System.out.println("In: " + currentName);
            }
        }while(!stop && count <10_000_000);
        stop = true;
        System.out.println("\n" + thrd.getName() + " terminating");
    }

}
