
package Chapter_6;


public class QSDemo {

    
    public static void main(String[] args) {
        
        char a[] = { 'd', 'x', 'a', 'r', 'p', 'j' , 'i' };
        
        
        System.out.println("Original Array: ");
        for(char ch:a){
            System.out.print(ch);
        }
        
        System.out.println();
        
        QuickSort.qsort(a);
        
        for(char ch:a){
            System.out.print(ch);
        }
    }

}
