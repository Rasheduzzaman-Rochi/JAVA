import java.util.Scanner;
public class InputScanner {
    public static void main(String[] args) {
        // int x;
        try (Scanner sc = new Scanner(System.in)) {      // I can run this code without using try block...
            // int x;
            // long x;
            // System.out.print("Enter the number: ");
            // x=sc.nextInt();
            // x = sc.nextLong();
            // System.out.print("Your number: " + x);

            String x;
            System.out.print("Enter the Line: ");
            x = sc.nextLine();
            System.out.print("Your Entered Line: " + x);
            sc.close();
        }
    }
}
