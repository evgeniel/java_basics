public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Молоко", 40);
        basket.add("Хлеб", 35, 2);
        basket.add("Макровь", 60, 500.0);
        basket.add("Картофель", 70, 2, 2000.0);
        basket.print("Корзина:");

        System.out.println("==================================================");

        Arithmetic arithmetic = new Arithmetic(23, 57);
        arithmetic.print();

    }
}
