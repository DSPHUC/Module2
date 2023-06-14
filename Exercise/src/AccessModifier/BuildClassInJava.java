package AccessModifier;

public class BuildClassInJava {
    private String name = "John";
    private String classes = "C02";
    public static int numberID;

    public BuildClassInJava() {

    }

    public BuildClassInJava(String name, String classes) {
        this.name = name;
        this.classes = classes;
        numberID++;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getClasses() {

        return classes;
    }

    public void setClasses(String classes) {

        this.classes = classes;
    }
}

