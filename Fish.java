public class Fish {
    private String name;
    private String species;
    private int[] feedings;

    public Fish(String name, String species) {
        this.name = name;
        this.species = species;
        this.feedings = new int[7];
    }

    // REQ 04
    public Fish(String name) {
        this(name, "Unknown");
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int[] getFeedings() {
        return feedings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setFeedings(int[] feedings) {
        this.feedings = feedings;
    }

    // REQ 05
    public void feed(int day, int grams) {
        //* */
        this.feedings[day] = this.feedings[day] + grams;
        // not int[] feedings because this creates a new one?
    }

    // REQ 06
    public int totalFed() {
        int sum = 0;
        for (int i = 0; i < feedings.length; i++){
            sum += feedings[i];
        }
        return sum;
    }

    // REQ 07
    public int busiestDay() {
        int largestNum = feedings[0];
        int indexOfLargestNum = 0;
        for (int i = 0; i < feedings.length-1; i++){
            if (largestNum < feedings[i+1]){
                //** */
                largestNum = feedings[i+1];
                indexOfLargestNum = i+1;
            }
        }
        
        return indexOfLargestNum;
    }

    // REQ 08
    public int[] copyFeedings() {
        int[] copy = new int[feedings.length];

        for (int i = 0; i< feedings.length; i++){
            copy[i] = feedings[i];
        }
        return copy;
    }

    // REQ 09

    /*public Integer lastFeeding() {
        if (feedings == null){
            return null;
        }

        int indexOfLastDay = feedings.length -1;
        for (int i = feedings.length -1; i > 0; i--){
            if (feedings[i] == 0){
                indexOfLastDay = i - 1;
            }
            else {
                return indexOfLastDay;
            }
        }
        return null;
    }
*/
    public Integer lastFeeding() {
       for (int i = feedings.length -1; i >= 0; i--){
            if (feedings[i] > 0){
                return i;
            }
            }
        return null;
        }
    

    // REQ 10
    public String toString() {
        return name.substring(0,1).toUpperCase() 
            + name.substring(1, name.length()) + " (" + species + ")";
    }

    // REQ 11
    public boolean equals(Fish other) {
        if (other == null){
            //why not .equals
            return false;
        }
        if (this.name.equals(other.name) && this.species.equals(other.species)){
            return true;
        }
        else {
            return false;
        }
    }

}
