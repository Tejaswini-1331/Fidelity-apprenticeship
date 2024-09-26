package Day4.Problem1;

abstract class shape {
    abstract double CalculateVolume(int a);
    abstract double CalculateVolume(int a, int b);
}

class cylinder extends shape{
    public double CalculateVolume(int r,int h){
        return Math.PI*r*r*h;
    }

    double CalculateVolume(int a) {
        return 0;
    }


}

class cube extends shape{
   public double CalculateVolume(int a){
       return a*a*a;
    }

    double CalculateVolume(int r, int h) {
        return 0;
    }
}