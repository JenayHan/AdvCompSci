public class RegularHexagon extends Polygon{
    private double sideLength;

    public RegularHexagon(double sideLength){
        super(6);
        this.sideLength = sideLength;
    }
    
    public RegularHexagon(){
        this(1.0);
        //why do I need to add super?
    }
    
    public double getArea(){
        double area = 0;
        area = (3*Math.sqrt(3)/2) * sideLength * sideLength;
        return area;
    }

    public String toString(){
        String descriptionOfHexagon = "";
        descriptionOfHexagon = "This is a Polygon. The sidelength is " + sideLength;
        return descriptionOfHexagon;
    }
    
}
