public class Solution4 {
    public static void main(String[] args) {
        typeOfTriangle(10,20,20);
        typeOfTriangle(-10,20,25);
        typeOfTriangle(90,60,30);
        typeOfTriangle(30,30,30);
    }
    private static void typeOfTriangle(int a, int b, int c) {

        if (a>0 && b>0 && c>0) {
            if (a == b && b == c) {
                System.out.println("равносторонний треугольник");
            } else if (a == b || b == c || a == c) {
                System.out.println("равнобедренный треугольник");
            } else if (a == 90 || b == 90 || c == 90) {
                System.out.println("прямоугольный треугольник");
            } else System.out.println("Обычный треугольник");
        }
        else System.out.println("Неправильно введённые данные");
    }
}
