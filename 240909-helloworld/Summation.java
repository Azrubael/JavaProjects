import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        String explanation = "Please enter a whole number greater zero: ";
        System.out.println(explanation);
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println(explanation);
            }
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println(explanation);
            }
        } while (num <= 0);

        int sum = 0;
        int count = 0;
        while (count <= num) {
            sum += count++;
        }
        System.out.println(sum);
        sc.close();
    }
}
