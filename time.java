import java.util.Scanner;
public class time {
    public static int Time(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Time Period (Years) (1-30): ");
        int years = 0;
        for (int i = 0; i < 1; i++) {
            years = scanner.nextInt() * 12;
            if (years <= 0 || years > 360){
                System.out.println("Enter a value between 1 and 30 years.");
                i--;
            }
        }
        return years;
    }
}
