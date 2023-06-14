package AccesModifier;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(111, "Nam");
        StaticMethod s2 = new StaticMethod(222, "Trung");
        StaticMethod s3 = new StaticMethod(333, "Cường");
        s1.display();
        s2.display();
        s3.display();
    }

}
