public class Solution8 {
    private static int count = 0;
    public static void main(String[] args) {
        counter();
        counter();
        counter();
        counter();
        counter();
        counter();
    }
    private static void counter() {
        if (count < 5 ) {
            count++;
        }
        else System.out.println("Вы превысили лимит");
    }
}
