class Calc {
    public final int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}


public final class CalcFinal extends Calc {

    @Override
    public int subtract(int a, int b) {
        System.out.println("Overridden method is called");
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        CalcFinal obj = new CalcFinal();
        int a = 10, b = 5;
        System.out.println(obj.add(3,4));
        System.out.println(obj.subtract(7, 2));
        System.out.println(obj.multiply(a,b));
    }
}