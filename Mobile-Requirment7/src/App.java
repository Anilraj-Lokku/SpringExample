import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the Mobile Brand:");
        String brandName = scanner.nextLine();
        MobileBrand mobileBrand = new MobileBrand(brandName);

        while (true) {
            System.out.println("1. Add Mobile");
            System.out.println("2. Delete Mobile");
            System.out.println("3. Display Mobiles");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    String mobileDetails = scanner.nextLine();
                    Mobile newMobile = Mobile.createMobile(mobileDetails);
                    mobileBrand.addMobileToMobileBrand(newMobile);
                    System.out.println("Mobile successfully added");
                    break;
                case 2:
                    System.out.println("Enter the reference id of the mobile to be deleted:");
                    String refIdToDelete = scanner.nextLine();
                    boolean removed = mobileBrand.removeMobileFromMobileBrand(refIdToDelete);
                    if (removed) {
                        System.out.println("Mobile successfully deleted");
                    } else {
                        System.out.println("Mobile not found in the Mobile Brand");
                    }
                    break;
                case 3:
                    mobileBrand.displayMobiles();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
