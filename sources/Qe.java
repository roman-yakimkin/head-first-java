import java.util.Scanner;

public class Qe {
    public static void main(String[] args) {
        double a, b, c, x1, x2;
        String answer;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.print("Input a: ");
            a = keyboard.nextDouble();
            System.out.print("Input b: ");
            b = keyboard.nextDouble();
            System.out.print("Input c: ");
            c = keyboard.nextDouble();

            double d = b*b - 4*a*c;
            if (d<0){
                System.out.println("No real roots");
            } 
            else {
                x1 = (-b + Math.sqrt(d))/(2*a);
                x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("x1 = " + x1 + ",  x2 = "+x2);
            }
            System.out.print("Coutinue (y/n)?");
            answer = keyboard.next();
        }while("Yy".indexOf(answer) != -1);
    }
}