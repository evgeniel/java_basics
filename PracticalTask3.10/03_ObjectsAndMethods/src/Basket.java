public class Basket {

    private static int countBasket = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;//гр.
    private static int totalCountProduct = 0;
    private static int totalCostProduct = 0;
    private static int averageTotalPriceProductBasket = 0;
    private static int averagePriceBasket = 0;

    public Basket() {
        increaseCountBasket(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCountBasket() {
        return countBasket;
    }

    public static void increaseCountBasket(int countBasket) {
        Basket.countBasket = Basket.countBasket + countBasket;
    }

    public static int getTotalCountProduct() {
        return totalCountProduct;
    }

    public static void increaseTotalCountProduct(int totalCountProduct) {
        Basket.totalCountProduct = Basket.totalCountProduct + totalCountProduct;
    }

    public static int getTotalCostProduct() {
        return totalCostProduct;
    }

    public static void increaseTotalCostProduct (int totalCostProduct) {
        Basket.totalCostProduct = Basket.totalCostProduct + totalCostProduct;
    }

    public static int getAverageTotalPriceProductBasket() {
        return averageTotalPriceProductBasket;
    }

    public static void calculationAverageTotalPriceProductBasket() {
        Basket.averageTotalPriceProductBasket = getTotalCostProduct() / getTotalCountProduct();
    }

    public static int getAveragePriceBasket() {
        return averagePriceBasket;
    }

    public static void calculationAveragePriceBasket() {
        Basket.averagePriceBasket = getTotalCostProduct() / getCountBasket();
    }

    public void add(String name, int price) { add(name, price, 1); }

    public void add(String name, int price, double weight) { add(name, price, 1, weight); }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " - " + weight + " гр.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
        increaseTotalCostProduct(count * price);
        increaseTotalCountProduct(count);
    }

    public void add(String name, int price, int count) { add(name, price, count, 0); }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
        System.out.println("Итоговая цена корзины: " + getTotalPrice());
        System.out.println("Итоговый вес корзины: " + getTotalWeight());
    }
}
