import java.util.Scanner;

public class VendingMachine {
    public static int thousand = 0, fiveHundred = 0, hundred = 0, fifty = 0, ten = 0, five = 0, two = 0, one = 0;
    public static int minimumNotes(int Rupees) {
        if (Rupees > 0) {
            if (Rupees >= 1000) {
                Rupees = Rupees - 1000;
                thousand++;
            } else if (Rupees >= 500) {
                Rupees = Rupees - 500;
                fiveHundred++;
            } else if (Rupees >= 100) {
                Rupees = Rupees - 100;
                hundred++;
            } else if (Rupees >= 50) {
                Rupees = Rupees - 50;
                fifty++;
            } else if (Rupees >= 10) {
                Rupees = Rupees - 10;
                ten++;
            } else if (Rupees >= 5) {
                Rupees = Rupees - 5;
                five++;
            } else if (Rupees >= 2) {
                Rupees = Rupees - 2;
                two++;
            } else {
                Rupees = Rupees - 1;
                one++;
            }
            return minimumNotes(Rupees);
        } else {
            int minNumberOfNotes = thousand + fiveHundred + hundred + fifty + ten + five + two + one;
            System.out.println("Minimum number of notes: " + minNumberOfNotes);
            System.out.println("Notes of 1000 are " + ": " + thousand);
            System.out.println("Notes of 500 are " + ": " + fiveHundred);
            System.out.println("Notes of 100 are " + ": " + hundred);
            System.out.println("Notes of 50 are " + ": " + fifty);
            System.out.println("Notes of 10 are " + ": " + ten);
            System.out.println("Notes of 5 are " + ": " + five);
            System.out.println("Notes of 2 are " + ": " + two);
            System.out.println("Notes of 1 are " + ": " + one);

            return 0;
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter amount to be withdraw: ");
        int Rupees = s.nextInt();
        minimumNotes(Rupees);
    }
}
