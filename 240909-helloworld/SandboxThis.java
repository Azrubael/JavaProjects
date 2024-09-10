import java.util.Scanner;

class SandboxThis {
    int age;
    int height;
    String name;

    SandboxThis(int age, int h) {
        this.age = age; // this требуется явно
        height = h;     // this будет добавлен автоматически
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        SandboxThis obj1 = new SandboxThis(9, 19);
        System.out.println("Age = " + obj1.age);
        System.out.println("Height = " + obj1.height);

        System.out.print("Enter the name: ");
        Scanner sc = new Scanner(System.in);
        obj1.setName(sc.next());
        System.out.println("The entered name: " + obj1.getName());
    }

}