import java.util.Scanner;
public class DoWhile_loop {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String name = "";

            do {
                System.out.println("Enter your name: ");
                name = sc.nextLine();
            } while (name.isBlank());

            System.out.println("Hello, " + name + "! How are you?");
        }
    }
}
