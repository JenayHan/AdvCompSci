public class Trashcan {
    private double HeightinFeet;
    private String color;
    private boolean fullornot;
    private boolean doesitneedtobetakenout;
    private String typeoftrash;

    public void setcolor(String newcolor) {
        color = newcolor;
    }

    public String getcolor() {
        return color;
    }

    public void setfullornot(boolean newfullornot) {
        fullornot = newfullornot;
    }

    public boolean getfullornot() {
        return fullornot;
    }
    
    Trashcan() { //all class names must be capitalized
        HeightinFeet = 3;
        color = "pink";
        fullornot = true;
        doesitneedtobetakenout = false;
        typeoftrash = "garbage";
    }
    
    public void dumpitselfout(String question) {
        if (question.equals("Do you need to be dumped out?")) {
            
            if (fullornot == true); {
            doesitneedtobetakenout = true;
            System.out.println("yes, I'm dumping myself out now");
            }

            if ( fullornot == false); {
            doesitneedtobetakenout = false;
            System.out.println("no, put trash in me first");
            }
        }
        }
        
        
        public void runanundergroundillegalbusinesssellingtrashtoracoongangsters() {
            fullornot = false;
        }
    
}
