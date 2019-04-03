package main;

public class CalcTest {
     public static void main(String [] args){

         Calculator c1 = new Calculator();
         Calculator c2 = new Calculator();

         System.out.println(c1.add(2,4));
         System.out.println(c1.add(3.8,4.6));
         System.out.println(c1.subtract(4.6,c2.subtract(6.7,4)));
     }
}
