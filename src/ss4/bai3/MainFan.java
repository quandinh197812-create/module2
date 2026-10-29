package ss4.bai3;
import fan.Fan;
public class MainFan {
        public static void main(String[] args) {
            fan.Fan fan=new Fan();
            fan.setOn(true);
            System.out.println(fan.toString());
            fan.setSpeed(1);
            System.out.println(fan.toString());
            fan.setSpeed(2);
            System.out.println(fan.toString());
            fan.setSpeed(3);
            System.out.println(fan.toString());
            fan.stop();
            System.out.println(fan.toString());
        }
    }

