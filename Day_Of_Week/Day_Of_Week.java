import java.util.Scanner;

public class DayOfWeek {
    private static int day;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a date in (dd-mm-yyyy) format");
        System.out.print("Enter a date (dd): ");
        int date = s.nextInt();
        System.out.print("Enter a month (mm): ");
        int month = s.nextInt();
        System.out.print("Enter a year (yyyy): ");
        int year = s.nextInt();
        if (date > 31) {
            System.out.println("Date cannot be more than 31");
        } else if (month > 12) {
            System.out.println("Month cannot be more than 12");
          else {
            day = dayOfWeek(date, month, year);
        }

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

    }
    private static int dayOfWeek(int d, int m, int y) {
        int y0 = 0, x = 0, m0 = 0, d0 = 0;
        y0 = y - (14-m)/12;
        x  = y0 + y0/4 - y0/100 + y0/400;
        m0 = m + 12*((14-m)/12) - 2;
        d0 = (d+x+31*m0/12) % 7;        

        return d0;

    }
}
