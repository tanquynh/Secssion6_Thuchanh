package RA_Secssion6_Thuchanh1;

public class Ractangle {
    double width, height;
    public Ractangle(){}
    public Ractangle(double width, double height) {
        this.width = width;
        this.height = height;

    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
    public String display() {
        return "Rectangle{"+" width="+this.width+", height="+this.height+"}";
    }
}

