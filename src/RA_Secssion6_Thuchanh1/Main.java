package RA_Secssion6_Thuchanh1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();
        Ractangle Ractangle = new Ractangle(width, height);
        System.out.println(Ractangle.getArea());
        System.out.println(Ractangle.getPerimeter());
        System.out.println(Ractangle.display());
    }}


