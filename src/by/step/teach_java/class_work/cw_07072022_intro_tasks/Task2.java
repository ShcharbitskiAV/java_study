package by.step.teach_java.class_work.cw_07072022_intro_tasks;
public class Task2 {
    public static void main(String[] args) {
        int n = 137;
        int b = n / 100;
        int p = (n / 10) % 10;
        int c = n % 10;
        System.out.println(b + p + c);
    }
}
