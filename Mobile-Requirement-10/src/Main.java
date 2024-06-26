import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of mobiles:");
        int numberOfMobiles = Integer.parseInt(scanner.nextLine().trim());

        List<Mobile> mobileList = new ArrayList<>();
        for (int i = 0; i < numberOfMobiles; i++) {
            String details = scanner.nextLine().trim();
            Mobile mobile = Mobile.createMobile(details);
            mobileList.add(mobile);
        }

        System.out.println("Enter a type to sort:");
        System.out.println("1. Sort by price");
        System.out.println("2. Sort by launched date");
        int choice = Integer.parseInt(scanner.nextLine().trim());

        switch (choice) {
            case 1:
                Collections.sort(mobileList);
                displayMobiles(mobileList);
                break;
            case 2:
                Collections.sort(mobileList, new LaunchedDateComparator());
                displayMobiles(mobileList);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static void displayMobiles(List<Mobile> mobileList) {
        if (mobileList.isEmpty()) {
            System.out.println("No such mobile is present");
        } else {
            System.out.format("%-15s %-15s %-12s %-8s %s\n", "Reference Id", "Model Name", "Display Size", "Price", "Launched Date");
            for (Mobile mobile : mobileList) {
                System.out.println(mobile);
            }
        }
    }
}
