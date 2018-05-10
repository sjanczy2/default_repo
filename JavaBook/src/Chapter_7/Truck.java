package Chapter_7;


public class Truck extends Vehicle{
    
    private int cargoCap;
    
    Truck(int p, int f, int m, int c){
        super(p,f,m);
        cargoCap = c;
    }
    
    int getCargo() {return cargoCap;}
    void putCargo(int c) {cargoCap = c;}

}
