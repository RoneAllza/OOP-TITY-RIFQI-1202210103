public class Calculation implements Runnable {
    private double radius, side, area;
    private double phi = 3.14;


    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }

    public void setSquare(double side) {
        this.side = side;
        area = side*side;
    }

    public double getSquare() {
        return area;
    }

    public void setCircle(double radius) {
        this.radius = radius;
        area = phi * radius * radius;
    }

    public double getCircle(){
        return area;
    }

    public void setTrapezoid(double a, double b, double t) {
        area = (a*b)/t;

    }

    public double getTrapezoid(){
        return area;
    }
    
}
