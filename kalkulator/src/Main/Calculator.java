package Main;

public class Calculator {
    private double a;
    private double b;

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    double add(double a, double b){
        return a+b;
    }
    double subtract(double a,double b){
        return a-b;
    }
    double multiply(double a,double b ){
        return a*b;
    }
    double divide(double a,double b){
        return a/b;
    }
}
