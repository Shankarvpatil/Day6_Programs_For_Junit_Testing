import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter principle loan amount: ");
        float P = s.nextFloat();
        System.out.print("Enter years to pay off the loan: ");
        int Y = s.nextInt();
        System.out.print("Enter a rate of interest: ");
        float R = s.nextFloat();

        monthlyPayment(P,Y,R);
    }

    private static void monthlyPayment(float P, int Y, float R) {
        int n = Y * 12;     // number of months for 'y' years
        float r = R / (12*100);
        float payment = (P*r) / (float)(1-(Math.pow(1+r, -n)));
        System.out.printf("Monthly payment: %.2f", payment);
    }
}
