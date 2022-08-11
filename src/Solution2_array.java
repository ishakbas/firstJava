public class Solution2_array {
    public static void main(String[] args) {
        System.out.println(returnMultiple(new int[]{3,4}));
    }
    private static int returnMultiple(int[] array) {
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            mul*=array[i];
        }
        return mul;
    }
}
