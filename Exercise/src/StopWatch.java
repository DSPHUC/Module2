import java.util.*;

public class StopWatch {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        String startTime = String.valueOf(stopWatch.getStartTime());
        System.out.println(startTime);
        Thread.sleep(500);
        System.out.println("End");
        stopWatch.stop();
        String endTime = String.valueOf(stopWatch.getEndTime());
        System.out.println(endTime);
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println(elapsedTime);
    }

    private long startTime;
    private long endTime;

    public StopWatch(String startTime, String endTime) {
        this.startTime = Long.parseLong(startTime);
        this.endTime = Long.parseLong(endTime);
    }

    public StopWatch() {
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = Long.parseLong(startTime);
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = Long.parseLong(endTime);
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}