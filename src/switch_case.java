public class switch_case {
    public static void main(String[] args) {
        String day = "Friday";

        switch (day) {
            case "Saturday" ->
                    System.out.println("Today is Saturday.");
            case "Sunday" ->
                    System.out.println("Today is Sunday.");
            case "Monday" ->
                    System.out.println("Today is Monday.");
            case "Tuesday" ->
                    System.out.println("Today is Tuesday.");
            case "Friday" ->
                    System.out.println("Today is Friday.");
            default ->
                    System.out.println("Out of Range.");
        }
    }
}
