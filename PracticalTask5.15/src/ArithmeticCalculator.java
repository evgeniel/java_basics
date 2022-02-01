public class ArithmeticCalculator {

    private final int firstNumber;
    private final int secondNumber;
    private int total = 0;

    public ArithmeticCalculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void calculate(Operation operation) {
        switch (operation) {
            case ADD:
                total = firstNumber + secondNumber;
                break;
            case SUBTRACT:
                total = firstNumber - secondNumber;
                break;
            case MULTIPLY:
                total = firstNumber * secondNumber;
                break;
        }
    }

    public String toString() {
        return "Операция: " + total;
    }
}
