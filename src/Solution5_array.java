public class Solution5_array {
    public static void main(String[] args) {
        System.out.println(checkString(new String[] {"wsdfsg", "", "asa", ""}));
    }
    private static int checkString(String[] st) {
        int count = 0;
        for (String s : st) {
            if (s.isEmpty()) count++;
        }
        return count;
    }

}
