import java.util.Scanner;
import java.math.*;
public class TestCone {
    public static void main(String[] args) {
        Cone c1=new Cone();
        Scanner s=new Scanner(System.in);
        double radius=s.nextDouble();
        double height=s.nextDouble();
        c1.setHeight(height);
        c1.setRadius(radius);
        System.out.printf("The floorage of c1 is %.14f,and the volume is %.14f\n",c1.getArea(),c1.getVolume());

        Cone c2 = new Cone(radius+1,height+2);
        System.out.printf("The floorage of c2 is %.14f,and the volume is %.14f",c2.getArea(),c2.getVolume());
    }
}



class Cone{
    private double radius;
    double height;


Cone(){}

Cone(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }
    public double getVolume(){
        return (Math.PI*radius*radius*height)/3;
    }
public double getArea(){
    return Math.PI*radius*radius;}

    public void setRadius(double radius){
this.radius=radius;
}

    public void setHeight(double height){
this.height=height;

}
    public double getRadius(){
return this.radius;
}

    public double getHeight(){
    return this.height; }


}

