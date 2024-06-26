import java.util.Scanner;
import java.util.TreeMap;

public class Test {
    public static int MaximumProduct(int N, String S) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        String Str = map.toString();
        int prefix = 0;
        for (char c : Str.toCharArray()) {
            if (c >= '0' && c <= '9') {
                prefix = prefix * 10 + (c - '0'); // Convert character to integer and build prefix
                break;
            }
        }

        int suffix = 0;
        for (int i = Str.length() - 1; i >= 0; i--) {
            char c = Str.charAt(i);
            if (c >= '0' && c <= '9') {
                suffix = suffix * 10 + (c - '0'); // Convert character to integer and build suffix
                break;
            }
        }
        return prefix * suffix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();
        System.out.println(MaximumProduct(N, S));
    }
}
