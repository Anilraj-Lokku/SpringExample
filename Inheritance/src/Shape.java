
class Shape {
     String borderColor;
     String backgroundColor;

    public Shape(String borderColor, String backgroundColor) {
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    public String calculateArea() {
        return "Formula to calculate area is not defined for the base Shape class";
    }
}

class Triangle extends Shape {
    public Triangle(String borderColor, String backgroundColor) {
        super(borderColor, backgroundColor);
    }

    
    public String calculateArea() {
        return "Area of Triangle = (1/2) * base * height";
    }
}

class Rectangle extends Shape {
    public Rectangle(String borderColor, String backgroundColor) {
        super(borderColor, backgroundColor);
    }

    
    public String calculateArea() {
        return "Area of Rectangle = length * width";
    }
}

class Circle extends Shape {
    public Circle(String borderColor, String backgroundColor) {
        super(borderColor, backgroundColor);
    }

    public String calculateArea() {
        return "Area of Circle = (22/7) * radius * radius";
    }
}