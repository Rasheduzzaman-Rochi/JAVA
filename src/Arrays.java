import java.util.Arrays;
public class arrays {
    public static void main (String[] args){
        int age = 100;
        int physics = 95;
        int chem = 89;
        int eng = 92;

        int[] marks = new int[4];
        marks[0] = age;
        marks[1] = physics;
        marks[2] = chem;
        marks[3] = eng;
        System.out.println(marks[0]);
        System.out.println(marks.length);

        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
