package ss4.bai2;

public class MainWtach {
        public static void main(String[] args) {
            StopWatch stopwatch = new StopWatch();
            stopwatch.start();
            long sum = 0;
            for (int i = 0; i < 100000000; i++) {
                sum += i;
            }
            stopwatch.stop();
            System.out.println("Thời gian thực thi vòng lặp: " + stopwatch.getElapsedTime() + " ms");
        }
    }

