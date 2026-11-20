public class Square extends Rectangle{
    public Square(int sideLength){
        super(sideLength, sideLength);
    }

    public Square(){
        this(4);
        //why does it automatically give me getnumbeofsides()
    }

    public void setLength(int length){
        super.setLength(length);
        super.setWidth(length);
        //why can't Square take Rectangle private instance variables
    }
    public void setWidth(int width){
        super.setWidth(width);
        super.setLength(width);
    }
    //doesn't this have the same probalem with chanigng only one side?

    public String toString(){
        String descriptionOfSquare = "";
        descriptionOfSquare = super.toString() + " This is a square.";
        return descriptionOfSquare;
    }

  


}