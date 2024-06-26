import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Set<Mobile> mobileSet = new HashSet<>();

        System.out.println("Enter mobile 1 detail:");
        String mobile1Input = scanner.nextLine();
        String[] mobile1Details = mobile1Input.split(",");

        String referenceId1 = mobile1Details[0];
        String modelName1 = mobile1Details[1];
        Double displaySize1 = Double.parseDouble(mobile1Details[2]);
        Double price1 = Double.parseDouble(mobile1Details[3]);
        Date launchedDate1 = dateFormat.parse(mobile1Details[4]);

        Mobile mobile1 = new Mobile(referenceId1, modelName1, 
        		displaySize1, price1, launchedDate1);

        System.out.println("Enter mobile 2 detail:");
        String mobile2Input = scanner.nextLine();
        String[] mobile2Details = mobile2Input.split(",");

        String referenceId2 = mobile2Details[0];
        String modelName2 = mobile2Details[1];
        Double displaySize2 = Double.parseDouble(mobile2Details[2]);
        Double price2 = Double.parseDouble(mobile2Details[3]);
        Date launchedDate2 = dateFormat.parse(mobile2Details[4]);

        Mobile mobile2 = new Mobile(referenceId2, modelName2, displaySize2, price2, launchedDate2);

        scanner.close();

        mobileSet.add(mobile1);
        mobileSet.add(mobile2);

        System.out.println("\nMobile 1");
        System.out.println(mobile1);

        System.out.println("\nMobile 2");
        System.out.println(mobile2);
        if (mobileSet.size() == 1) {
            System.out.println("\nMobile 1 is same as Mobile 2");
        } else {
            System.out.println("\nMobile 1 and Mobile 2 are different");
        }
    }
}

