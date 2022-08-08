import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter first number");
        int num1 = sc.nextInt();
        System.out.println("Inter second number");
        int num2 = sc.nextInt();
        System.out.println("Inter the operation");
        String operation = sc.next();
        if (operation.equals("+")) {
            System.out.println(num1+num2);
        }else if (operation.equals("-")){
            System.out.println(num1-num2);
        } else if (operation.equals("/")) {
            System.out.println(num1/num2);
        } else System.out.println("wrong operation");
    }

}
