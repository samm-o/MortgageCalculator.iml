
import java.text.NumberFormat;
import java.util.ArrayList;
public class Calculator {
    public static void calculator(){
        var loan = Loan.Prinicpal();
        var interestRate = InterestRate.Rate();
        var years = time.Time();

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        var mortgage = loan * (interestRate*(Math.pow(1+interestRate, years)))/((Math.pow(1+interestRate, years))-1);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly mortgage payment: " + currency.format(mortgage));

        var payments = new ArrayList<Double>();
        var paymentsmade = 1;
        for (int i = 0; i < years; i++) {
            var balance = loan * ((Math.pow(1+interestRate, years))-(Math.pow(1+interestRate, paymentsmade)))/((Math.pow(1+interestRate, years))-1);
            payments.add(balance);
            paymentsmade++;
        }
        System.out.println("");
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (var item:
             payments) {
            System.out.println(currency.format(item));
        }
    }
}
