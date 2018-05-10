package Chapter_4;


class Vehicle {
    int passenger;
    int fuelcap;
    int mpg;
    
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
}
