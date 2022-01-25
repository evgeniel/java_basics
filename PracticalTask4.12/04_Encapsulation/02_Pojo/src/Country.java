public class Country {

    private String name;
    private int population;
    private int area;//кв.км.
    private String capitalName;
    private boolean accessSea;

    public Country(String name) {
        this.name = name;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public boolean getAccessSea() {
        return accessSea;
    }

    public void setAccessSea(boolean accessSea) {
        this.accessSea = accessSea;
    }
}
