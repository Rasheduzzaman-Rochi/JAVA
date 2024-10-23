import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList);
        System.out.println(arrayList.get(1));

        arrayList.set(2, 4);
        System.out.println(arrayList);
    }
}
