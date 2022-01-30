public class Dimensions {

    private final int height;
    private final int length;
    private final int width;

    public Dimensions(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(height, length, width);
    }

    public int getLength() {
        return length;
    }

    public Dimensions setLength(int length) {
        return new Dimensions(height, length, width);
    }

    public int getWidth() {
        return width;
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(height, length, width);
    }

    public double cargoVolume() {
        double volume = height * length * width;
        return volume;
    }

    public String toString() {
        return cargoVolume() + " см3, где высота - " + height +
                "см., длина - " + length +
                "см., ширина - " + width + "см.";
    }

}
