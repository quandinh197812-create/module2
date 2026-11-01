package ss6.bai2;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
public Point2D(){

}
public Point2D(float x,float y){
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

