import java.util.Scanner;
public class InterestRate {
    public static float Rate(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Annual Interest Rate (0 - 30 %): ");
        float interestRate = 0;
        for (int i = 0; i < 1; i++) {
            interestRate = (scanner.nextFloat() / 100) / 12;
            if (interestRate <= 0 || interestRate > 0.025){
                System.out.println("Enter an interest rate between 0 and 30.");
                i--;
            }
        }
        return interestRate;
    }
}
