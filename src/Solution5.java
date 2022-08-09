public class Solution5 {
    public static void main(String[] args) {
        checkAge(18);
    }
    private static void checkAge(int age) {
        if (age >=18 && age <=45) System.out.println("Доступ к сайту открыт");
        else System.out.println("Вы бот");
    }
}
