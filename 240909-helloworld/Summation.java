import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (count <= num) {
            sum += count++;
        }
        System.out.println(sum);
        sc.close();
    }
}
