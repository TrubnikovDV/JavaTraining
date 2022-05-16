
package JavaTraining;

import java.text.DecimalFormat;

public class MyFirstProgram {
    public static void main(String[] args) {

      Point ab=new Point(1.0,5.0,1.0,5.0);
      String result = new DecimalFormat("#0.00").format(ab.distance());
      System.out.println("Расстояние между двумя точками AB = " + result);

      Square s = new Square(5);
      System.out.println("Площадь квадрата " + "l" + " = " + s.area());

      Rectangle r = new Rectangle( 2,4);
      System.out.println("Площадь прямоугольника " + "a" + " и " + "b" + " = " +  r.area());

    }
    }


