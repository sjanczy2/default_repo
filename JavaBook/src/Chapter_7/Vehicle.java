package Chapter_7;

class Vehicle {
    private int passenger;
    private int fuelcap;
    private int mpg;
    
    Vehicle(int p, int f, int m){
        passenger = p;
        fuelcap = f;
        mpg = m;
    }
    
    int range(){
        return mpg*fuelcap;
    }
    
    double fuelNedded(int miles){
        return (double) miles/mpg;
    }
    
    int getPassengers() {return passenger;}
    void setPassenger(int p){passenger = p;}
    int getFuelcap() {return fuelcap;}
    void setFuelcap(int f){fuelcap= f;}
    int getMpg() {return mpg;}
    void setMpg(int m){passenger = m;}
}


