import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a your number ");
        int c = s.nextInt();
        double epsilon = 1E-15;
        float t = c;
        while(Math.abs(t-c/t) > epsilon * t) {
            t = (float) ((c/t + t)/2.0);     
            }
        System.out.println("The Square root of " + c + " is " + t);
    }
}
