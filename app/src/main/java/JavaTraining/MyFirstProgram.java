
package JavaTraining;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("Dima");

        double len = 5;
      System.out.println(len = area(len));

      double a = 2;
      double b=4;
      System.out.println("Площадь прямоугольника " + "a" + " и " + "b" + " = " +  area (a,b));
    }
    public static void hello(String somebody){

      System.out.println("Hello " + somebody);
    }
    public static double area (double l){
      return l*l;
    }
    public static double area (double a, double b){
      return a*b;
    }
    }

