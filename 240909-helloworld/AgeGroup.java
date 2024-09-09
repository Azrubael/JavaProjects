import java.util.Scanner;
public class AgeGroup {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        String explanation = "Please enter a valid age (an integer from 1 to 300): ";
        int age;
        do {
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println(explanation);
            }
            age = sc.nextInt();
            if (age <= 0 || age > 300) {
                System.out.println(explanation);
            }
        } while (age <= 0 || age > 300);

        String color = null;
        String ageName = null;

        if (age < 5) {
            ageName = "Infant";
        } else if (age < 12) {
            ageName = "Child";
        } else if (age < 19) {
            ageName = "Teenager";
        } else if (age < 60) {
            ageName = "Adult";
        } else {
            ageName = "Senior Citizen";
        }

        switch (ageName) {
            case "Infant":
                color = "White";
                break;
            case "Child":
                color = "Yellow";
                break;
            case "Teenager":
                color = "Green";
                break;
            case "Adult":
                color = "Blue";
                break;
            case "Senior Citizen":
                color = "Violet";
                break;
            default:
                color = "Invalid";
        }

        String result = "Your age group is " + ageName + " and your color is " + color;
        System.out.println(result);
        sc.close();
    }
}
