package Chapter__12;

enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

public class Ordinal {

    public static void main(String[] args) {
        Tools tools[] = Tools.values();
        
        for(Tools t:tools){
            System.out.println("Tool: " + t + " Ordinal: " + t.ordinal());
        }
    }
    
}
