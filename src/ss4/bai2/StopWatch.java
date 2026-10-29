package ss4.bai2;
public class StopWatch {
        private long startTime;
        private long stopTime;

        public long getStartTime() {
            return startTime;
        }

        public long getStopTime() {
            return stopTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;

        }

        public void setStopTime(long stopTime) {
            this.stopTime = stopTime;
        }

        public void start() {
            this.startTime = System.currentTimeMillis();
        }

        public void stop() {
            this.stopTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return this.stopTime - this.startTime;
        }

    }

