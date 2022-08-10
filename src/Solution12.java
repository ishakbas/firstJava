public class Solution12 {
    public static void main(String[] args) {
        System.out.println(checkUrl("http://ankaramesi"));
        System.out.println(checkUrl("htt://ankaramesi"));
        System.out.println(checkUrl("http/:/ankaramesi"));

    }
    private static boolean checkUrl(String url) {
        return url.startsWith("http://");
    }
}
