import java.util.Scanner;
public class Loan {
    public static float Prinicpal(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal Amount (1K - 1M): ");
        float loan = 0;
        for (int i = 0; i < 1; i++) {
            loan = scanner.nextFloat();
            if (loan < 1000 || loan > 1000000){
                System.out.println("Enter a loan between 1K and 1M.");
                i--;
            }
        }
        return loan;
    }
}
