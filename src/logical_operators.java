public class logical_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 90;

//        if(a<50 && b<50) {
//            System.out.println("Both numbers are less than 50.");
//        }

        if(a<50 || b<50)
            System.out.println("At least one number is less than 50.");

        boolean isAdult = false;
        if(!isAdult)
            System.out.println("You are not an adult.");
        else
            System.out.println("You are an adult.");
    }
}
