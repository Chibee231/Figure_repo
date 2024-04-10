package AnotherFigure;

public class Hexagon {
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    private double a;

    public void Per(double a){
        System.out.println(6*a);
    }

    public void Square(double a) {
        System.out.println((3*Math.sqrt(3) * a*a)/2);
    }

}
