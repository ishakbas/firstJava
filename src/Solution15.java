public class Solution15 {
    public static void main(String[] args) {
        System.out.println(checkNum(0));
        System.out.println(checkNum(1));
        System.out.println(checkNum(-1));

    }
    private static int checkNum(int num) {
        if (num != 0) {
            if (num < 0) {
                num = Math.abs(num);
            }
        }
        return num;
    }
}

