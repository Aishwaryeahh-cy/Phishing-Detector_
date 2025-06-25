import java.util.Scanner;

public class PhishingDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phishingKeywords = {"login", "verify", "update", "secure", "account", "bank", "free", "urgent"};
        System.out.print("Enter the URL to check: ");
        String url = scanner.nextLine().toLowerCase();

        boolean isPhishing = false;

        for (String keyword : phishingKeywords) {
            if (url.contains(keyword)) {
                isPhishing = true;
                break;
            }
        }
        

        if (isPhishing) {
            System.out.println(" Warning: This URL may be a phishing attempt!Be Aware");
        } else {
            System.out.println(" This URL seems safe.");
        }

        scanner.close();
    }
}
