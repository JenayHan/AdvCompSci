public class StudentRecord {

    private String name;
    private int[] scores;
    
    public StudentRecord(String name, int[] scores){
        this.name = name;
        this.scores = scores;
        if (scores == null){
            this.scores = new int[0];
        }
    }

    public StudentRecord(String name){
        this(name, new int[0]);
        //why not just (name, scores)
    }

    public String getName(){
        return name;
    }
    public int[] getScores(){
        return scores;
    }
 
    public int getTestScore(int testNumber){
        if (scores == null || testNumber < 0 || testNumber >= scores.length){
            return -1;
        }
        return scores[testNumber];
    }

    public String toString(){
        String statement = name + "'s scores: [";
        for (int i = 0; i < scores.length; i++){
            statement = statement + scores[i];
            if (i < scores.length -1){
                statement += ", ";
            }
            
            //why can't I say + scores
        }
        statement += "]";
        return statement;
    }

    public double getAverage(int first, int last){
        double sumOfTerms = 0;
        double numberOfTerms = 0;
        for (int i = first; i <= last; i++){
        sumOfTerms += scores[i];
        numberOfTerms++;
        }

        return sumOfTerms / numberOfTerms;
    }

    public double getAverage(){
        if (scores == null || scores.length == 0){
            return 0.0;
        }

        return this.getAverage(0, scores.length -1);
    }

    public boolean hasImproved(){

        if (scores.length == 0 || scores.length == 1){
            return true;
        }

        for (int i = 0; i < scores.length - 1; i++){
            if (scores[i] > scores[i+1]){
                return false;
            }
        }
        return true;
    }

    public double getFinalAverage(){
        if (scores.length == 0 || scores.length == 0){
            return 0.0;
        }


        if (hasImproved() == true){
            return this.getAverage(scores.length /2, scores.length -1);
        }

        else {
            return this.getAverage();
        }
    }
    }







