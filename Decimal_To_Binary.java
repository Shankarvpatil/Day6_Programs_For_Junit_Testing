import java.util.Scanner;
class java {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[20];
        int i = 0;
        System.out.print("Enter a decimal number : ");
        int n = s.nextInt();
        while (n > 0)
        {
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(arr[j]);
    }
}
