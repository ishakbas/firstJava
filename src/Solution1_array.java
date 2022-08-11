public class Solution1_array {
    public static void main(String[] args) {
        System.out.println(returnMin(new int[]{265,324,44,52,123,345}));
    }
    private static int returnMin(int[] arrayOfNum) {
        int min = arrayOfNum[0];
        for (int i = 0; i < arrayOfNum.length; i++) {
            if (min > arrayOfNum[i]) {
                min = arrayOfNum[i];
            }
        }
        return min;
    }
}
