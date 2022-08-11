public class Solution1_array {
    public static void main(String[] args) {
        System.out.println(returnMin(new int[]{265,324,444,52,123,345}));
    }
    private static int returnMin(int[] arrayOfNum) {
        int min = arrayOfNum[0];
        for (int j : arrayOfNum) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}
