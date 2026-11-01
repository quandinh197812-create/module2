package ss6.bai3;
public class Point {
    private float x=0.0f;
    private float y=0.0f;
    public Point(){
    }
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public void setx(float x){
        this.x=x;
    }
    public float getx(){
        return x;
    }
    public void sety(float y){
        this.y=y;
    }
    public float gety(){
        return y;
    }
    public void setxy(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getxy(){
        return new float[]{this.x,this.y};
    }
@Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
