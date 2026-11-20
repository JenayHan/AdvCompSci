
public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }

    
    public double calculateSlope(){
        double y2 = p2.getY();
        double x2 = p2.getX();
        double slope = 0;
        double y1 = p1.getY();
        double x1 = p1.getX();

        slope = (double)((y2 - y1)/(x2 - x1));
        return slope;
    }

    String equation = "";
    public String pointSlopeForm(){
        int y1 = p1.getY();
        int x1 = p1.getX();

        equation = "(y - " + y1 + ") " + "= " + calculateSlope() + "(x - " + x1 + ")";
        return equation;

    }

    double a = 0;
    double b = 0;
    double c = 0;

public boolean isCoordinateOnLine(Point p){
    double y2 = p2.getY();
    double x2 = p2.getX();
    double y1 = p1.getY();
    double x1 = p1.getX();

    a = -(y2 - y1);
    b = x2 - x1;
    c = -(a * x1 + b * y1);
    if (p == null){
        return false;
    }
    
    if (a*p.getX() + b*p.getY() + c == 0){
        return true;
    }
    else {
        return false;
    }
}       

public void shift(int dx, int dy){
    p1.setX(p1.getX() + dx);
    p2.setX(p2.getX() + dx);
    p1.setY(p1.getY() + dy);
    p2.setY(p2.getY() + dy);
    
}

public boolean isParallelTo(Line other){
    if (other == null){
        return false;
    }

    if (this.calculateSlope() == other.calculateSlope()){
        return true;
    }
    else {
        return false;
    }
}

public Line copy(){
    Point copyOfp1 = new Point(p1.getX(), p1.getY());
    Point copyOfp2 = new Point(p2.getX(), p2.getY());
    return new Line(copyOfp1, copyOfp2);
}

}
