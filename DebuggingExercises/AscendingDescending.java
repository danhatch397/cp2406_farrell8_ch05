import java.util.Scanner;

/**
 * Created by Daniel on 8/25/16.
 */
public class AscendingDescending {
    public static void main(String[] args) {
        System.out.println("Enter first integer:");
        Scanner kb = new Scanner(System.in);
        int one = kb.nextInt();
        System.out.println("Enter second integer:");
        int two = kb.nextInt();
        System.out.println("Enter third integer:");
        int three = kb.nextInt();

        if (one < two && one < three){
            if (two < three){
                System.out.println("Ascending: " + one + " " + two + " " + three);
                System.out.println("Descending: " + three + " " + two + " " + one);
            } else {
                System.out.println("Ascending: " + one + " " + three + " " + two);
                System.out.println("Descending " + two + " " + three + " " + one);
            }
        } else if (two < one && two < three){
            if (one < three) {
                System.out.println("Ascending: " + two + " " + one + " " + three);
                System.out.println("Descending: " + three + " " + one + " " + two);
            } else{
                System.out.println("Ascending: " + two + " " + three + " " + one);
                System.out.println("Descending: " + one + " " + three + " " + two);
            }
        } else if (three < one && three < two) {
            if (one < two) {
                System.out.println("Ascending: " + three + " " + one + " " + two);
                System.out.println("Descending: " + two + " " + one + " " + three);
            } else {
                System.out.println("Ascending: " + three + " " + two + " " + one);
                System.out.println("Descending: " + one + " " + two + " " + three);
            }
        }
    }
}
