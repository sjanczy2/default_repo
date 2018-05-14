
package Chapter__13;


public class StackDemo {


    public static void main(String[] args) {

        Integer iArr[] = new Integer[5];
        GenStack<Integer> sT= new GenStack<Integer>(iArr);

        try{
            for(int i = 0; i < iArr.length; i++)
                sT.push(i);

        } catch(StackFullException ex){
            System.out.println(ex);
        }
        System.out.println();

        try{
            for(int i = 0; i < iArr.length; i++)
                System.out.println(sT.pop());

        } catch(StackEmptyException ex){
            System.out.println(ex);
        }

    }

}
