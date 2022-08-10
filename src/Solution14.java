public class Solution14 {
    public static void main(String[] args) {
        checkName("Иван","Иванов");
        checkName("Сергей","Иванов");
        checkName("Сергей","Горелов");
    }
    private static void checkName(String firstName, String secondName) {
        if (firstName.equals("Иван") || secondName.equals("Иванов")) System.out.println("отказ");
        else System.out.println("Здравствуйте, " + firstName + " " + secondName);
    }
}
