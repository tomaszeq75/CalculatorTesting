public class Calculator {
    private int a, b;
    int[] array = {1, 2, 3, 4, 5};

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        int divValue = 0;
        try {
            divValue = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Błąd - Dzielenie przez 0");
            throw new ArithmeticException("Dzielenie przez 0");
        }
        return divValue;
    }

    public int modulo(int a, int b) {
        int modValue = 0;
        try {
            modValue = a % b;
        } catch (ArithmeticException e) {
            System.out.println("Błąd - Dzielenie przez 0");
        }
        return modValue;
    }
}
