import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the shape (Triangle/Rectangle/Circle):");
        String choice = scanner.nextLine().trim().toLowerCase();

        Shape shape;
        switch (choice) {
            case "triangle":
                shape = new Triangle("black", "white");
                break;
            case "rectangle":
                shape = new Rectangle("black", "white");
                break;
            case "circle":
                shape = new Circle("black", "white");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println(shape.calculateArea());
        scanner.close();
    }
}
