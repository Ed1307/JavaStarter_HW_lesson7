import java.util.Scanner;
public class Arithmetics {
    static int add (int a, int b){
        return (a+b);
    }
    static int sub (int a, int b){
        return (a-b);
    }
    static int mul (int a, int b){
        return (a * b);
    }
    static int div (int a, int b){
        if (b==0){
            System.out.println("на ноль делить нельзя");
            return 0;
        }
        return (a / b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите a:");
        int a = input.nextInt();
        System.out.println("введите b:");
        int b = input.nextInt();
        System.out.println("введите знак");
        String znak = input.next();
        switch (znak) {
            case ("+"): {
                System.out.println(add(a, b));
                break;
            }
            case ("-"): {
                System.out.println(sub(a, b));
                break;
            }
            case ("*"): {
                System.out.println(mul(a, b));
                break;
            }
            case ("/"): {
                System.out.println(div(a, b));
                break;
            }
        }
    }
}
