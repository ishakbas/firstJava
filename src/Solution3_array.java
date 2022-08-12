public class Solution3_array {
    public static void main(String[] args) {
        System.out.println(checkNumbers(new int[]{1, -2, -2, 7, 8, -9}));
    }
    private static int checkNumbers(int[] ar) {
        int count = 0;
        for (int j : ar) {
            if (j < 0) {
                count++;
            }
        }
        return count;
    }
}
