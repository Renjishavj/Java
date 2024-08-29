// Abstract class Shape
abstract class Shape {
    
    abstract double calculateArea();
    
   
    void displayArea() {
        System.out.println("The area of the shape is: " + calculateArea());
    }
}


class Circle extends Shape {
    private double radius;
    
  
    Circle(double radius) {
        this.radius = radius;
    }
    
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
   
    @Override
    double calculateArea() {
        return width * height;
    }
}

public class Abstract {
    public static void main(String[] args) {
        
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        
      
        circle.displayArea(); 
        rectangle.displayArea(); 
    }
}
