abstract class Shape {
    private double height, width;

    public Shape(double w, double h) {
        width = w;
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    abstract double getArea();
}

class Rectangle extends Shape {
    Rectangle(double width, double height) {
        super(width, height);
    }

    public double getArea() {
        return this.getHeight() * this.getWidth();
    }
}

class Square extends Shape {
    Square(double side) {
        super(side, side);
    }
    public double getArea() {
        return this.getHeight() * this.getWidth();
    }
}
public class ex5 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(2.4, 2.36);
        Shape s2 = new Square(142);
        System.out.println(s1.getArea());
        System.out.println(s2.getArea());
    }
}