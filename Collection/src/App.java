import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Enter the number of colleges:");
        int numberOfColleges = sc.nextInt();
        sc.nextLine(); // Consume newline

        List<College> colleges = new ArrayList<>();

        for (int i = 0; i < numberOfColleges; i++) {
            System.out.println("Enter details for college " + (i + 1) + " (comma-separated):");
            String details = sc.nextLine();
            String[] parts = details.split(",");

            College college = new College(
                parts[0], // name
                parts[1], // website
                parts[2], // mobile
                parts[3], // founder
                Integer.parseInt(parts[4]), // numberOfDept
                parts[5], // location
                sdf.parse(parts[6]) // startingDate
            );
            colleges.add(college);
        }

        Map<String, Integer> locationCount = College.calculateLocationCount(colleges);

        System.out.format("%-15s %s\n", "Location", "Count");
        for (Map.Entry<String, Integer> entry : locationCount.entrySet()) {
            System.out.format("%-15s %d\n", entry.getKey(), entry.getValue());
        }

        sc.close();
    }
}
