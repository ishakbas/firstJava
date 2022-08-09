public class Solution6 {
    public static void main(String[] args) {
        checkAge(2);
        checkAge(8);
        checkAge(17);
        checkAge(45);
        checkAge(78);
        checkAge(101);
    }
    private static void checkAge(int age) {
        if (age <= 0 || age >= 100) System.out.println("Invalid age");
        else {
            if (age <= 6) System.out.println("В садик");
            else if (age <= 16) System.out.println("В школу");
            else if (age <= 22) System.out.println("В учебное заведение");
            else if (age <= 60) System.out.println("На работу");
            else System.out.println("вы старше 60");
        }
    }
}
