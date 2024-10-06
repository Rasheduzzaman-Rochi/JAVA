public class break_continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i==3){
                i=i+1;
                continue; // skip the current iteration and continue with the next iteration
            }
            System.out.println(i);
            i++;
            if (i>5){
                break;
            }
        }
    }
}
