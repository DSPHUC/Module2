package AccessModifier;

public class TestBuildClassInJava {
    public static void main(String[] args) {
        BuildClassInJava student1 = new BuildClassInJava();
        System.out.print(BuildClassInJava.numberID);
        System.out.println(" Name: " + student1.getName() + " Class: " + student1.getClasses());
        BuildClassInJava student2 = new BuildClassInJava("Nam","C0423I1");
        System.out.print(BuildClassInJava.numberID);
        System.out.println(" Name: " + student2.getName() + " Class: " + student2.getClasses());
        BuildClassInJava student3 = new BuildClassInJava("Trung","C0423I1");
        System.out.print(BuildClassInJava.numberID);
        System.out.println(" Name: " + student3.getName() + " Class: " + student3.getClasses());
        BuildClassInJava student4 = new BuildClassInJava("Cường","C0423I1");
        System.out.print(BuildClassInJava.numberID);
        System.out.println(" Name: " + student4.getName() + " Class: " + student4.getClasses());
    }
}
