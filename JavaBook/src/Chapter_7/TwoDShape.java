package Chapter_7;


abstract public class TwoDShape {
    
    private double width, height;
    private String name;
    
    //Default Constructor
    TwoDShape(){
        width = height = 0.0;
        name = "none";
    }
    
    //Parameterized Constructor
    TwoDShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }
    
    //Equal width height Constructor
    TwoDShape(double x, String n){
        width = height = x;
        name = n;
    }
    
    //Constructor for Object
    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    
    double getWidth(){ return width;}
    double getHeight() { return height;}
    void setWidth(double w) { width = w;}
    void setHeight(double h) { height = h;}
    
    String getName(){return name;}
    
    void showDim(){
        System.out.println("Width: " + width + " Height: " + height);
    }
    
    abstract double area();

}
