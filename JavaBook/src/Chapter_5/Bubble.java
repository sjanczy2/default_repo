
package Chapter_5;


public class Bubble {

    
    public static void main(String[] args) {
        String words[] = {"asd", "butt", "yes", "hoho", "add",
                        "asdas", "bne", "chen", ":Chen", "ASdcc"};
        
        int a,b,size;
        String t;
        size = words.length;
        
        System.out.println("Original Array:");
        for(String word: words) System.out.print(" "+word);
        System.out.println("");
        
        for(a = 1; a < size; a++){
            for(b = size -1; b >=a; b--){
                if(words[b-1].compareTo(words[b]) > 0){
                    t = words[b-1];
                    words[b-1] = words[b];
                    words[b] = t;
                }
            }
        }
        
        System.out.print("Sorted Array:");
        for(int i = 0; i < words.length; i++) System.out.print(" "+words[i]);
        System.out.println("");
    }

}
