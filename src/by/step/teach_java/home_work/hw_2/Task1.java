package by.step.teach_java.home_work.hw_2;
<<<<<<< HEAD

=======
>>>>>>> 6356e345aa65f4928bb0ba5cd6a8a36e83d38996
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        byte s = day.nextByte();

        switch (s) {
            case (1): {
                System.out.println("Monday");
            break;}

            case (2): {
                 System.out.println("Tuesday");
            break; }

            case (3): {
                System.out.println("Wednesday");
                break; }

            case (4): {
                System.out.println("Thursday");
                break; }

            case (5): {
                System.out.println("Friday");
                break; }

            case (6): {
                System.out.println("Saturday");
                break; }

            case (7): {
                System.out.println("Sunday");
                break; }

            default:
                System.out.println("Incorrect input");
                break;}
    }
}
