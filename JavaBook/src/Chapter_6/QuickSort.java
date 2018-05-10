package Chapter_6;


public class QuickSort {
    
    static void qsort(char items[]){
        qs(items, 0, items.length -1);
    }
    
    private static void qs(char items[], int left, int right){
        int i, j;
        char x,y;
        
        i= left; j= right;
        x=items[(left+right)/2];
        
        do{
            while((items[i] <x) && (i < right)) i++;
            while((x < items[j]) && (j > left)) j--;
            System.out.println("i: " + i + " j: " + j);
            
            if(i <= j){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
            System.out.println(items);
        }while (i <= j);
        
        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i ,right);
    }

}
