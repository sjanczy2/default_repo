package Chapter_6;


public class Test {
    
    int a;
    Test(int i){a = i;}
    
    public static void main(String args[]){
    
        System.out.println(sum(2,5,7,9));
    }
    
    static int sum(int ... i){
        int sum = 0;
        for(int y:i)
            sum +=y;
        return sum;
    }
    
            

}
