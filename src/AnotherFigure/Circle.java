package AnotherFigure;

public class Circle {
    private double r;
    private static final double pi = 3.14;

    public void Square(double r) {
        System.out.println(pi*Math.pow(r,2));
    }

    public void Per(double r) {
        System.out.println(2*pi*r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
