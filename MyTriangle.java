public class MyTriangle {
    private MyPoint v1 ;
    private  MyPoint v2;
    private  MyPoint v3 ;
    private  int x1;
    private int y1;
    private int x2;
    private  int x3;
    private  int y2;

    public MyTriangle(int x1, int y1, int x2, int x3, int y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.x3 = x3;
        this.y2 = y2;
    }

    public  MyTriangle(int v1 , int v2 , int v3){
        this.v1=new MyPoint(v1);
        this.v2=new MyPoint(v2);
        this.v3 = new MyPoint(v3);
    }
    public  double getPerimeter(int x1 , int y1 , int x2 , int y2, int x3 , int y3){
        double dis;
        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) + (x3-x1)*(x1-x3));
        return dis;
    }
    public  String getType(){

        String  res = "";
        if(x1 == x2 && x2 == x3)
        {

            res= "t is an Equilateral Triangle";
        }
        else if(x1 == x2 || x2 == x3 || x1 == x3)
        {

            res= "It is an Isosceles Triangle";
        }
        else
        {
            res="It is a Scalene Triangle";
        }
        return res;
    }
    public MyPoint getV1() {
        return v1;
    }

    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }

    public MyPoint getV2() {
        return v2;
    }

    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }

    public MyPoint getV3() {
        return v3;
    }

    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY4() {
        return y2;
    }

    public void setY4(int y4) {
        this.y2 = y4;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ", x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", x3=" + x3 +
                ", y4=" + y2 +
                '}';
    }
}