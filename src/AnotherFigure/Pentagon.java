package AnotherFigure;

public class Pentagon {
    private double h;
    private double a,b,c,d,e;

    public void Per(double a){
        System.out.println(5*a);
    }
    public void Per(double a,double b,double c,double d,double e) {
        System.out.println(a+b+c+d+e);
    }
    public void Square(double h, double a) {
        System.out.println(0.5*5*a*h);
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }
}
