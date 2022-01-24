public class Arithmetic {

    private int sumNumbers = 0;
    private int differenceNumbers = 0;
    private int productsNumbers = 0;
    private int meanNumbers = 0;
    private int maxTwoNumbers = 0;
    private int minTwoNumbers = 0;

    public Arithmetic(int firstNumber, int secondNumber) {
        sumNumbers(firstNumber, secondNumber);
        differenceNumbers(firstNumber, secondNumber);
        productsNumbers(firstNumber, secondNumber);
        meanNumbers(firstNumber, secondNumber);
        maxTwoNumbers(firstNumber, secondNumber);
        minTwoNumbers(firstNumber, secondNumber);
    }

    public void sumNumbers(int firstNumber, int secondNumber) {
        sumNumbers = firstNumber + secondNumber;
    }

    public void differenceNumbers(int firstNumber, int secondNumber) {
        differenceNumbers = firstNumber - secondNumber;
    }

    public void productsNumbers(int firstNumber, int secondNumber) {
        productsNumbers = firstNumber * secondNumber;
    }

    public void meanNumbers(int firstNumber, int secondNumber) {
        meanNumbers = (firstNumber + secondNumber) / 2;
    }

    public void maxTwoNumbers(int firstNumber, int secondNumber) {
        maxTwoNumbers = Math.max(firstNumber, secondNumber);
    }

    public void minTwoNumbers(int firstNumber, int secondNumber) {
        minTwoNumbers = Math.min(firstNumber, secondNumber);
    }

    public void print() {
        System.out.print("Арифметические операции:\n");
        System.out.println("Сумма чисел = " + sumNumbers);
        System.out.println("Разность чисел = " + differenceNumbers);
        System.out.println("Произведение чисел = " + productsNumbers);
        System.out.println("Среднее значение чисел = " + meanNumbers);
        System.out.println("Максимальное из двух чисел = " + maxTwoNumbers);
        System.out.println("Минимальное из двух чисел = " + minTwoNumbers);
    }

}
