public class Phrase {

    private String text;

    public Phrase(String newText){
        newText = text;
    }
    
    public String getText(){
        return text;
    }
    
    // Read REQ 03
    public String reversed() {
        for (int count = 0; count <= text.length(); count++){
        text = text.substring(0) + text.substring(count);              
        }
        
        return text;
    
    }

    // Read REQ 04
    public int countChar(char target) {
        return -999;
    }

    // Read REQ 05
    public boolean isAllDigits() {
        return true;
    }

    // Read REQ 06
    public int countAdjacentPairs() {
        return -999;
    }

    // Read REQ 07
    public int countOccurrences(String target) {
        return -999;
    }

    // Read REQ 08
    public String capitalizeWords() {
        return "TODO";
    }

    // Read REQ 09
    public boolean isPalindrome() {
        return false;
    }

}
