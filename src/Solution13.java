public class Solution13 {
    public static void main(String[] args) {
        checkGrade(4,4,4,4,4);
    }
    private static void checkGrade(int a, int b, int c, int d, int e) {
        int grade = (a + b + c + d + e) / 5;
        if (a>1 && a<=5 && b>1 && b<=5 && c>1 && c<=5 && d>1 && d<=5 && e>1 && e<=5) {
            if (grade == 2) System.out.println("Двоечник");
            else if (grade == 3) System.out.println("Троечник");
            else if (grade == 4) System.out.println("Хорошист");
            else if (grade == 5) System.out.println("Отличник");
            System.out.println(grade);
        }
        else System.out.println("Неправильные данные");
    }
}
