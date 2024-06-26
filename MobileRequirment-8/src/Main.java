import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the reference "
        		+ "Id to be validated:");
        String referenceId = scanner.nextLine().trim();

        if (validateReferenceId(referenceId)) {
            System.out.println("Reference Id is valid");
        } else {
            System.out.println("Reference Id is invalid");
        }

        scanner.close();
    }

    public static boolean validateReferenceId(String referenceId) {
        String regex = "^#([A-Z]{2,3})( \\d{2})?( ["
        		+ "A-Z0-9]{2,6}-\\d{2,4})$";
        return referenceId.matches(regex);
    }
}
