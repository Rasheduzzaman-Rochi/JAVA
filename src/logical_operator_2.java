import java.util.Scanner;

public class logical_operator_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your cash: ");
        int cash = sc.nextInt();

        if (cash < 10){
            System.out.println("cannot buy anything..get more cash");
        }
        else if (cash >= 10 && cash < 50){
            System.out.println("can get 1 thing");
        }
        else{
            System.out.println("can get 2 things");
        }
    }
}

