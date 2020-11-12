import java.util.Scanner;

public class NumbersCheck {
    static boolean ifPositive(int a){
        return (a>=0);
    }
    static boolean ifProstoye(int a){
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if((a%i)==0){
                count++;
            }
        }
        return (count<=2);
    }
    static boolean ifDelitsa(int a){
        return (a%2==0)||(a%5==0)||(a%3==0)||(a%6==0)||(a%9==0);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        int a = input.nextInt();
        System.out.println("Число положительное: " + ifPositive(a));
        System.out.println("Число простое: " + ifProstoye(a));
        System.out.println("Число делится на 2, 5, 3, 6, 9 без остатка: " + ifDelitsa(a));
    }
}
