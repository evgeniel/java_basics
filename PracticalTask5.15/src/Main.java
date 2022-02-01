public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(23, 23);
        arithmeticCalculator.calculate(Operation.MULTIPLY);
        System.out.println(arithmeticCalculator);
        arithmeticCalculator.calculate(Operation.ADD);
        System.out.println(arithmeticCalculator);
        arithmeticCalculator.calculate(Operation.SUBTRACT);
        System.out.println(arithmeticCalculator);
    }
}
