package RA_Secssion6_Thuchanh4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();

        calculator.setA(a);
        calculator.setB(b);

        System.out.println("Tổng 2 số là: " + calculator.add());
        System.out.println("Hiệu 2 số là: " + calculator.sub());
        System.out.println("Tích 2 số là: " + calculator.multi());

        if (b != 0) {
            System.out.println("Thương 2 số là: " + calculator.div());
        } else {
            System.out.println("Không thể chia cho 0.");
        }

        scanner.close();
    }
}
