import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {
        double sum = 0.0;
        double sum1=0.0;
        Scanner scan =
                new Scanner(" 8,0; 4,8; 9,0; 9,0; 1; 10; 56");
       scan.useDelimiter(";\\s*");
        while (scan.hasNext()) {
            //sum1 += scan.nextDouble();
           if (scan.hasNextDouble()) {
              //  System.out.println("double "+scan.nextDouble());
               System.out.println("ttt: "+scan.nextDouble());
                sum += scan.nextDouble();
// 1.3; 2.0;  8.5; 8.0; 4.8; 9.0; 9.0; 1; 10

            }
            else {
               System.out.println(scan.next());
            }
        }
        System.out.printf("Сумма чисел = " + sum);
        System.out.printf("Сумма чисел1 = " + sum1);

    }

}