public class Capital {

    private String name;
    private int population;
    private int countBridge;
    private int countBus;
    private boolean accessPark;

    public Capital(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCountBridge() {
        return countBridge;
    }

    public void setCountBridge(int countBridge) {
        this.countBridge = countBridge;
    }

    public int getCountBus() {
        return countBus;
    }

    public void setCountBus(int countBus) {
        this.countBus = countBus;
    }

    public boolean getAccessPark() {
        return accessPark;
    }

    public void setAccessPark(boolean accessPark) {
        this.accessPark = accessPark;
    }
}
