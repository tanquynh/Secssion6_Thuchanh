package RA_Secssion6_Thuchanh4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím.

        Calculator calculator = new Calculator(); // Tạo một đối tượng máy tính từ lớp Calculator bạn đã định nghĩa.

        System.out.print("Nhập a = "); // Hiển thị thông báo để nhập giá trị cho a.
        double a = scanner.nextDouble(); // Đọc giá trị của a từ bàn phím.

        System.out.print("Nhập b = "); // Hiển thị thông báo để nhập giá trị cho b.
        double b = scanner.nextDouble(); // Đọc giá trị của b từ bàn phím.

        calculator.setA(a); // Đặt giá trị của a vào đối tượng máy tính.
        calculator.setB(b); // Đặt giá trị của b vào đối tượng máy tính.

        System.out.println("Tổng 2 số là: " + calculator.add()); // In ra tổng của a và b.
        System.out.println("Hiệu 2 số là: " + calculator.sub()); // In ra hiệu của a và b.
        System.out.println("Tích 2 số là: " + calculator.multi()); // In ra tích của a và b.

        if (b != 0) {
            System.out.println("Thương 2 số là: " + calculator.div()); // Kiểm tra xem b có khác 0 không trước khi thực hiện phép chia và in ra thương của a và b.
        } else {
            System.out.println("Không thể chia cho 0."); // Nếu b = 0, in ra thông báo không thể chia cho 0.
        }

        scanner.close(); // Đóng đối tượng Scanner khi đã sử dụng xong để giải phóng tài nguyên hệ thống.
    }
}
