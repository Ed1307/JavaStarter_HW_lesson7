import java.util.Scanner;
public class Conversion {
    static void valuta (double a, double b){
        double grivnas = a * b;
        System.out.println(grivnas + " гривен.");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество долларов");
        double a = input.nextDouble();
        System.out.println("Введите курс к доллару");
        double b = input.nextDouble();
        valuta(a, b);
    }
}
