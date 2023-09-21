package RA_Secssion6_Thuchanh3;

public class Main {
    public static void main(String[] args) {
        Category dm3 = new Category(3, "quần áo");
        Category dm4 = new Category(4, "áo");
        Category dm1 = new Category(1, "quần");
        Category dm2 = new Category(2, "áo");
        Product product1 = new Product(1, "quần âu", 150000, dm1);
        Product product2 = new Product(2, "quần jean", 150000, dm2);
        Product product3 = new Product(3, "áo sơ mi", 150000, dm3);
        Product product4 = new Product(4, "áo phông", 150000, dm4);
        System.out.println("Danh sách sản phẩm");
        product1.display();
        product2.display();
        product3.display();
        product4.display();

    }
}
