class Shape {
    Shape() {
        System.out.println("class Shape constructor");
    }
    public void display() {
       System.out.println("Inside display");
    }
}
class Rectangle extends Shape {
    Rectangle() {
        System.out.println("class Rectangle constructor");
    }
    public void area() {
       System.out.println("Inside area");
    }
}
class Square extends Rectangle {
    Square() {
        System.out.println("class Square constructor");
    }
    public void length() {
       System.out.println("Inside length");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Square square = new Square();
        square.display();
        square.area();
        square.length();
    }
}