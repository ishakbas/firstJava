public class Solution3 {
    public static void main(String[] args) {
        isDayOff(false,true);
        isDayOff(true,false);
        isDayOff(false,false);
    }
    private static void isDayOff(boolean isWeekend, boolean isHoliday) {
        if (!isWeekend) {
            if (!isHoliday) {
                System.out.println("WakeUp! 6 a.m");
            }
        }
        else System.out.println("WakeUp! 11 a.m");
    }
}
