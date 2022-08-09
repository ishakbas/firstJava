public class Solution7 {
    public static void main(String[] args) {
        checkName("Антон");
        checkName("Денис");
        checkName("Андрей");
    }
    private static void checkName(String name) {
        if (name.isEmpty()) {
            System.out.println("Вы ничего не ввели!");
        }
        else {
            if (name.equals("Антон") || name.equals("Денис")) {
                System.out.println("Добро пожаловать отсюда!");
            }
            else System.out.println("Добро пожаловать!");
        }
    }

}
