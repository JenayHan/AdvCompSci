public class QuizScore {
    private String typed;

    public QuizScore(String typed){
        this.typed = typed;

    }

    public String getTyped(){
        return typed;
    }

    public Integer getPoints(){
        if (typed == null || -1  == typed.indexOf("/")){
            return null;
        }
        
        return ParseTools.parseOrNull(typed.substring(0, typed.indexOf("/")));
    }

    public Integer getOutOf(){
        if (typed == null || -1  == typed.indexOf("/")){
            return null;
        }
        
        return ParseTools.parseOrNull(typed.substring(typed.indexOf("/") +1));
        
    }

    public Double percent(){
        if (getPoints() == null || getOutOf() == null){
            return null;
        }
        double number = getPoints();
        double total = getOutOf();
        double result = 0;
        result = (number * 100)/total;
        return result;
    }

    public boolean isPerfect(){

        if (getPoints() == null || getOutOf() == null){
            return false;
        }

        if (getPoints().equals(getOutOf())){
            return true;
        }
        //Integer is an object unlike int which is primitive

        else {
            return false;
        }
    }

    public boolean sameScoreAs(QuizScore other){
        if (other == null){
            return false;
        }

        Integer points = this.getPoints();
        Integer points2 = other.getPoints();
        Integer total = this.getOutOf();
        Integer total2 = other.getOutOf();
        
        if (points == null || points2 == null || total == null || total2 == null){
            return false;
        }

        if (this.getPoints().equals(other.getPoints()) && this.getOutOf().equals(other.getOutOf())){
            return true;
        }
        else {
            return false;
        }
    }







}
