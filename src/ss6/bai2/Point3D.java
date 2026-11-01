package ss6.bai2;

public class Point3D extends Point2D{
    private float z=0.0f;
    public Point3D(){
        super();
    }
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }
    public void setz(float z){
        this.z=z;
    }
    public float getz(){
        return z;
    }
    public void setxyz(float x,float y,float z){
        this.z=z;
        setxy(x,y);
    }
    public float[] getxyz(){
        return new float[]{getx(),gety(),this.z=z};
    }
    @Override
    public String toString(){
        return "("+getx()+","+gety()+","+z+")";
    }
}
