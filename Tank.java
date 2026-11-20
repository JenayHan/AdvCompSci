public class Tank {
    private String tankName;
    private Fish[] residents;

    public Tank(String tankName, Fish[] residents) {
        this.tankName = tankName;
        this.residents = residents;
    }

    public String getTankName() {
        return tankName;
    }

    public Fish[] getResidents() {
        return residents;
    }

    public void setTankName(String tankName) {
        this.tankName = tankName;
    }

    public void setResidents(Fish[] residents) {
        this.residents = residents;
    }

    // REQ 14
    public Fish findByName(String name) {
        if (residents == null){
            return null;
        }
        
        for (int i = 0; i < residents.length; i++){
            if (residents[i] != null && residents[i].getName().equals(name)){
                return residents[i];
        
            }
            
        }
        return null;
    }

    // REQ 15
    public int countSpecies(String species) {
        int count = 0;
        for (int i = 0; i < residents.length; i++){
            if (residents[i] != null && residents[i].getSpecies().equals(species)){
                count++;
            }
        }
        return count;
    }

    // REQ 16
    public String toString() {
        String descriptionOfTank = tankName + " [";
        for (int i = 0; i < residents.length; i++){
            if (residents[i] != null){
                descriptionOfTank += residents[i].getName();
            }
            int indexOfLastTerm = 0;

            for (int w = 0; w < residents.length -1; w++){
                indexOfLastTerm = w;
                if (residents[w+1] != null){
                    indexOfLastTerm = w+1;
                }
            }
            if (i < indexOfLastTerm && residents[i] != null){
                descriptionOfTank += ", ";
            }
        }
        descriptionOfTank += "]";
        return descriptionOfTank;
        //is this the most efficient way to do it?

    }

    public Fish[] ofSpecies(String species){
        //Fish[], why not just String[]
        int count = 0;
        //* */
        Fish[] fishOfThisSpecies = new Fish[residents.length];
        //why does residetns.someting not work but residents[i].getsomething works
        for (int i = 0; i< residents.length; i++){
            if (residents[i] != null && residents[i].getSpecies().equals(species)){
                fishOfThisSpecies[count] = residents[i];
                count++;
            }
        }
        if (count == 0){
            Fish[] empty = new Fish[0];
            return empty;
        }
        Fish[] newfishOfThisSpecies = new Fish[count];
        for (int w =0; w < count; w++){
            
            newfishOfThisSpecies[w] = fishOfThisSpecies[w];
        }
        return newfishOfThisSpecies;

    }
}
