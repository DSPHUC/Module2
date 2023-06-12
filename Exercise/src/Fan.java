import java.util.Scanner;

public class Fan {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Fan fan1 = new Fan("fast", 10, "yelow", "on");
        String fan1Info = fan1.toString();
        System.out.println(fan1Info);
        Fan fan2 = new Fan();
        fan2.setSpeed("medium");
        String fan2Info = fan2.toString();
        System.out.println(fan2Info);
        Fan fan3 = new Fan("medium", 20,"red","on");
        String fan3Info = fan3.toString();
        System.out.println(fan3Info);
    }

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed; // tốc độ quạt mặc
    boolean on; // on là chế độ bật tắt quạt
    private double radius; // bán kính quạt
    private String color; // màu quạt


    public int getSpeed() {
        return this.speed;
    }

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(String speed, double radius, String color, String status) {
        this.setSpeed(speed);
        this.radius = radius;
        this.color = color;
        this.setStatus(status);
    }

    public void setSpeed(String speed) {
        switch (speed) {
            case "medium":
                this.speed = MEDIUM;
                break;
            case "fast":
                this.speed = FAST;
                break;
            default:
                this.speed = SLOW;
        }
    }

    public void setStatus(String status) {
        this.on = status.equals("on");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "Fan is on: speed " + this.speed + ", color " + this.color + ", radius " + this.radius;
        } else
            return "Fan is off: color " + this.color + ", radius " + this.radius;
    }
}
