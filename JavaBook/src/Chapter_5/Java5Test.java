
package Chapter_5;


public class Java5Test {

    
    public static void main(String[] args) {
        
        double[] nums = {33.42 , 123.2, 5.0, 4.0, 3.0, 234.1, 312.5 ,
                        231.2, 123.2, 577.1};
        
        double avg = 0;
        
        for(double val : nums){
            avg +=val;
        }
        avg /= 10;
        
        System.out.println(avg);
    }

}
