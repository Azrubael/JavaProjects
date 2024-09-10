public class SandBox {
    // Класс с приватным конструктором
    int amount;

    private SandBox() {
        amount = 5;
        System.out.println("Вызван конструктор класса SandBox");
    }

    private static int getSquare(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int result = getSquare(i);
            System.out.println("Квадтатом числа " + i + " является " + result);
        }

        SandBox obj1 = new SandBox();
        System.out.println("Значение поля amount: " + obj1.amount);

        Company obj2 = new Company();
        System.out.println("Название компании: " + obj2.name);
    }

}


class Company {
    // Пример создания пакетного класса с публичным конструктором
    String name;
    
    public Company() {
        name = "Fundamenta";
    }

}

