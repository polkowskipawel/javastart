package Main;

public class kalkulator {
    public static void main(String[] args){
    double a = 4,b =4;

    Calculator c1 = new Calculator();
    c1.setA(a);
    c1.setB(b);

    System.out.println("Dodawanie:" + c1.add(c1.getA(),c1.getB()));
    System.out.println("Odejmowanie :" + c1.subtract(c1.getA(),c1.getB()));
    System.out.println("Mnożenie :" + c1.multiply(c1.getA(),c1.getB()));
    System.out.println("Dzielenie :" +c1.divide(c1.getA(),c1.getB()));
    }
}
