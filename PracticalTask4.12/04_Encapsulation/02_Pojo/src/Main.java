public class Main {

    public static void main(String[] args) {
        Country country = new Country("Russia");
        country.setPopulation(150000);
        country.setArea(17000000);
        country.setCapitalName("Moscow");
        country.setAccessSea(true);
        System.out.println("Страна: " + country.getName() + "\nНаселение: " + country.getPopulation() +
                "\nПлощадь: " + country.getArea() + " кв.км.\nСтолица: " + country.getCapitalName() +
                "\nВыход к морю: " + country.getAccessSea() + "\n=========================");

        Capital capital = new Capital("Moscow", 15000000);
        capital.setCountBridge(7);
        capital.setCountBus(1560);
        capital.setAccessPark(true);
        System.out.println("Столица: " + capital.getName() + "\nНаселение: " + capital.getPopulation() +
                "\nКоличество мостов: " + capital.getCountBridge() + "\nКоличество автобусов: " + capital.getCountBus() +
                "\nНаличие парка: " + capital.getAccessPark());
    }
}
