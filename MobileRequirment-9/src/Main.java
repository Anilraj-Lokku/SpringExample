import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Enter the number of mobiles:");
        int numberOfMobiles = Integer.parseInt(scanner.nextLine().trim());

        List<Mobile> mobileList = new ArrayList<>();
        for (int i = 0; i < numberOfMobiles; i++) {
            String details = scanner.nextLine().trim();
            String[] parts = details.split(",");
            String referenceId = parts[0].trim();
            String modelName = parts[1].trim();
            Double displaySize = Double.parseDouble(parts[2].trim());
            Double price = Double.parseDouble(parts[3].trim());
            Date launchedDate = dateFormat.parse(parts[4].trim());

            Mobile mobile = new Mobile(referenceId, modelName, displaySize, price, launchedDate);
            mobileList.add(mobile);
        }

        System.out.println("Enter a search type:");
        System.out.println("1. By Model Name");
        System.out.println("2. By Display Size");
        int choice = Integer.parseInt(scanner.nextLine().trim());

        MobileBO mobileBO = new MobileBO();
        switch (choice) {
            case 1:
                System.out.println("Enter the Model Name:");
                String modelName = scanner.nextLine().trim();
                List<Mobile> byModelName = mobileBO.findMobile(mobileList, modelName);
                displayMobiles(byModelName);
                break;
            case 2:
                System.out.println("Enter the Display Size:");
                Double displaySize = Double.parseDouble(scanner.nextLine().trim());
                List<Mobile> byDisplaySize = mobileBO.findMobile(mobileList, displaySize);
                displayMobiles(byDisplaySize);
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
