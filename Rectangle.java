public class Rectangle {
    private int length;
    private int width;

    public Rectangle() { //all class names must be capitalized
        length = 3;
        width = 5;
    }

    public Rectangle(int newLength, int newWidth){
        length = newLength;
        width = newWidth;
    }   
    
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public void setLength(int newLength){
        length = newLength;
    }
    public void setWidth(int newWidth){
        width = newWidth;
    }

    public int calculateArea(){
        int area = length * width;
        return area;
    }
    public int calculatePerimeter(){
        int perimeter = 2 * (length + width);
        return perimeter;

    }
    public double calculateDiagonal(){
        double sum = Math.sqrt(Math.pow(length, 2) + (Math.pow(width, 2)));
        return sum;
    }
    public String toString(){
        return "This rectangle has length " + length + " and width " + width;
    }
    public boolean equals(Rectangle other){
        if (getLength() == other.getLength() 
            && getWidth() == other.getWidth()) {
            return true;
    }
            return false;

        }
    }


    


