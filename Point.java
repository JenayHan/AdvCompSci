public class Point {
        private int x;
        private int y;
    

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public double distanceTo(Point other){
        double distance = 0;
        double x1 = x;
        double x2 = other.getX();
        double y1 = y;
        double y2 = other.getY();
        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    public Point midpointWith(Point other){
        int midX = (this.getX() + other.getX())/2;
        int mixY = (this.getY() + other.getY())/2;
        return new Point(midX, mixY);
        
        
    }
}







