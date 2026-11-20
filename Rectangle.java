public class Rectangle extends Polygon{
    private double length;
    private double width;

    public Rectangle(int length, int width){
        super(4);
        if (length < 0){
            this.length = 0;
        }
        else {
            this.length = length;
        }
        
        if (width < 0){
            this.width = 0;
        }
        else {
            this.width = width;
        }

    }

    public Rectangle(){
        this(4, 3);
    }

    public void setLength(int length){
        if (length < 0){
            this.length = 0;
        }
        else {
            this.length = length;
        }
        
    }
    public void setWidth(int width){
        if (width < 0){
            this.width = 0;
        }
        else {
            this.width = width;
        }
    }

    public double getArea(){
        double area = 0.0;
        area = width * length;
        return area;
    }

    public String toString(){
        String descriptionOfRectangle = "";
        descriptionOfRectangle = super.toString() + "This shape is a rectangle with length " 
            + length + ", width " + width + ", area " + getArea() + ".";
        return descriptionOfRectangle;
    }

    public boolean isSquare(){
        if (width == length){
            return true;
        }
        return false;
    }

    


}
