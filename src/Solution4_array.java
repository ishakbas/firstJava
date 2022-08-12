public class Solution4_array {
    public static void main(String[] args) {
        System.out.println(checkNumber(3,new int[]{2,3,1,3,1,3,5,6,3,2,2}));
    }
    private static int checkNumber(int a, int[] ar) {
        int count = 0;
        for (int i : ar) {
            if (a==i) count++;
        }
        return count;
    }
}
