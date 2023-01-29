/*
    Create class point with following instance variable and methods.
    Instance variable: private int x,y
    Constructors : public Point(), Point(int x, int y)
    Methods : public void setX(int x), setY(int y), setXY(int x,
    int y)

 */
//Bhupendra Patel
class point{
    private int x,y;
    public point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class p4 {
    public static void main(String[] args) {
        point ob = new point(10,15);
        ob.setX(11);
        ob.setY(16);
        ob.setXY(10,15);
    }
}
