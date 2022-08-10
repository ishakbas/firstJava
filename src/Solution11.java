public class Solution11 {
    public static void main(String[] args) {
        System.out.println(checkString("kek", "kek"));
        System.out.println(checkString("1kek", "2kek"));
    }
    private static boolean checkString(String text1, String text2) {
        return !text1.isEmpty() && !text2.isEmpty() && text1.equals(text2);
    }
}
