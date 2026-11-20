public class Triangle extends Polygon{
//why do I sometimes get the error
//The type Triangle must implement the inherited abstract method Polygon.getArea()
    private double base;
    private double height;

    public Triangle(int base, int height){
        super(3);
        if (base < 0){
            this.base = 0;
        }
        else {
            this.base = base;
        }
        
        if (height < 0){
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public Triangle(){
        this(3, 4);
    }

    public void setBase(int base){
        if (base < 0){
            this.base = 0;
        }
        else {
            this.base = base;
        }
    }

    public void setHeight(int height){
        if (height < 0){
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getArea(){
        double area = 0.0;
        area = (base * height)/2.0;
        return area;
    }

    public String toString(){
        String descriptionOfTriangle = "";
        descriptionOfTriangle = super.toString() + "This shape is a rectangle with height " 
            + height + ", base " + base + ", area " + getArea() + ".";
        return descriptionOfTriangle;
    }

 

}
