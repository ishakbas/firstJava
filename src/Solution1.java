public class Solution1 {

    public static void main(String[] args) {
        System.out.println(treugol(1, 2, 3));
        System.out.println(treugol(3, 5, 7));
        System.out.println(treugol(-3, 5, 7));


    }
    private static boolean treugol(int a, int b, int c) {
        return a+b>c && a+c>b && b+c>a && a>0 && b>0 && c>0;
    }
}