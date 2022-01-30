public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(10, 50, 20);
        InfoCargoCourierService infoCargoCourierService = new InfoCargoCourierService(dimensions, 3,
                "г. Ульяновск, ул. Нариманова, д. 150", false,
                "34HDH-SGD3748", true);
        System.out.println(infoCargoCourierService);

        Dimensions dimensions1 = dimensions.setHeight(20)
                .setLength(60)
                .setWidth(30);
        InfoCargoCourierService infoCargoCourierService1 = infoCargoCourierService
                .setDeliveryAddress("г. Ульяновск, ул. Радищева, д. 140")
                .setWeight(5).setDimensions(dimensions1);
        System.out.println(infoCargoCourierService1);
    }
}
