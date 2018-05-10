package Chapter_7;


public class Circle extends TwoDShape{

    Circle(){
        super();
    }
    
    Circle(double x, String name){
        super(x, name);
    }
    
    Circle(Circle ob){
        super(ob);
    }
    
    @Override
    double area() {
        return Math.PI*this.getWidth()/2*this.getHeight()/2;
    }
    

}
