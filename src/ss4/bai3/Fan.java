package ss4.bai3;

public class Fan
 {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String toString(){
        if(this.isOn()){
            return " speed: "+this.speed+" color : "+this.color+" radius: "+this.radius+" fan is on";
        }
        return " color: "+this.color+" radius: "+this.radius+" fan is off";
    }
    public void runOne(){
        this.speed= medium;
    }
    public void runThree(){
        this.speed=fast;
    }
    public void stop(){
        this.speed=0;
        this.on=false;
    }
}
