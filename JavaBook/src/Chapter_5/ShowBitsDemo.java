
package Chapter_5;


public class ShowBitsDemo {

    
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);
        
        System.out.println("123 to Binary");
        b.show(123);
        
        System.out.println("87987 to Binary");
        i.show(87987);
        
        System.out.println("237658768 to Binary");
        li.show(237658768);
        
        System.out.println("Low order bits of 87987");
        b.show(87987);
    }
    
    double[] num = new double[12];
    double num2[] = new double[12];

}
