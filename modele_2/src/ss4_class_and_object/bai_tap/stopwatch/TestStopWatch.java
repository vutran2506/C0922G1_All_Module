package ss4_class_and_object.bai_tap.stopwatch;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        stopWatch.stop();
        System.out.println("Bài toán chạy hết " + stopWatch.getElapsedTime() + " millis");
    }
}
