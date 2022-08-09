public class Solution2 {
    public static void main(String[] args) {
        System.out.println(minNumber(-2,2,3,4));
    }
    private static int minNumber(int a,int b,int c,int d) {
        int min = a;
        if (b<min) min = b;
        if (c<min) min = c;
        if (d<min) min = d;
        return min;

    }
}
