public class Solution9 {
    public static void main(String[] args) {
        checkWater(0);
        checkWater(50);
        checkWater(101);
    }
    private static void checkWater(int temp) {
        if (temp <= 0 ) System.out.println("Вода в твёрдом состоянии");
        else if (temp >= 100) System.out.println("Вода в газообразном состоянии");
        else System.out.println("Вода в жидком состоянии");
    }

}
