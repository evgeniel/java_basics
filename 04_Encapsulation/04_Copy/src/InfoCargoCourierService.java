public class InfoCargoCourierService {

    private final Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean canBeTurnedOver;
    private final String registrationNumber;
    private final boolean fragileCargo;

    public InfoCargoCourierService(Dimensions dimensions,
                                   int weight,
                                   String deliveryAddress,
                                   boolean canBeTurnedOver,
                                   String registrationNumber,
                                   boolean fragileCargo
    ) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.canBeTurnedOver = canBeTurnedOver;
        this.registrationNumber = registrationNumber;
        this.fragileCargo = fragileCargo;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public InfoCargoCourierService setDimensions(Dimensions dimensions) {
        return new InfoCargoCourierService(dimensions,
                weight,
                deliveryAddress,
                canBeTurnedOver,
                registrationNumber,
                fragileCargo);
    }

    public int getWeight() {
        return weight;
    }

    public InfoCargoCourierService setWeight(int weight) {
        return new InfoCargoCourierService(dimensions,
                weight,
                deliveryAddress,
                canBeTurnedOver,
                registrationNumber,
                fragileCargo);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public InfoCargoCourierService setDeliveryAddress(String deliveryAddress) {
        return new InfoCargoCourierService(dimensions,
                weight,
                deliveryAddress,
                canBeTurnedOver,
                registrationNumber,
                fragileCargo);
    }

    public boolean getCanBeTurnedOver() {
        return canBeTurnedOver;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean getFragileCargo() {
        return fragileCargo;
    }

    public String toString() {
        return "Информация о грузе, передаваемый в курьерскую службу:" +
                "\nГабариты = " + dimensions +
                ",\nМасса = " + weight +
                " кг.,\nАдрес доставки = " + deliveryAddress +
                ",\nМожно ли переворачивать = " + canBeTurnedOver +
                ",\nРегистрационный номер = " + registrationNumber +
                ",\nЯвляется ли груз хрупким = " + fragileCargo;
    }
}
