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

        System.out.println("==================================================");

        Printer printer = new Printer();
        printer.append("Печать без имени и количества");
        printer.append("Печать с именем но без количества", "Договор");
        printer.append("Печать с именем и с количеством", "Соглашение", 2);
        printer.print();
        printer.append("Вторая печать без имени и количества");
        printer.append("Вторая печать с именем но без количества", "Второй договор");
        printer.append("Вторая печать с именем и с количеством", "Второе соглашение", 3);
        printer.print();
        System.out.println(printer.getTotalNumberPrintedDocumentsAndPages());

    }
}
