package AccesModifier;

public class StaticProperty {
    private String name;
    private String engine;
    public static int numbeOfCars;

    public StaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numbeOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    void display() {
        System.out.println( name + " " + engine);
    }
}

