package RA_Secssion6_Thuchanh2;

public class Main {
    public static void main(String[] args) {
       Student student1 = new Student(1, "Nguyễn Văn A", true, "JV-01", 19, "Hà Nội");
       Student student2 = new Student(2, "Nguyễn Văn B", false, "JV-02", 20, "Đà Nẵng");
       Student student3 = new Student(3, "Nguyễn Văn C", true, "JV-01", 21, "TP Hồ Chí Minh");
       System.out.println("-------------Thông tin student1----------------") ;
       student1.display();
        System.out.println("-------------Thông tin student2------------------") ;
        student2.display();
        System.out.println("-------------Thông tin student3------------------") ;
        student3.display();


    }
}
