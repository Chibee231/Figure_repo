package AnotherFigure;

public class Oval {
    private double l;
    private double a,b;
    private static final double pi = 3.14;

    public void Per(double a,double b){
        System.out.println(2*pi*Math.sqrt((a*a + b*b)/2));
    }

    public void Square(double a,double b) {
        System.out.println(pi*a*b);
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
