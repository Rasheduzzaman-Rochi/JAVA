import java.util.Scanner;

public class mini_project {
    public static void main(String[] args) {
        int mynumber = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int usernumber = 0;

        do {
            System.out.println("Guess my number: ");
            usernumber = sc.nextInt();
            if (usernumber == mynumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (usernumber > mynumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("your number is small.");
            }
        } while (usernumber >= 0);
        System.out.println("My number was: " + mynumber);
    }
}
