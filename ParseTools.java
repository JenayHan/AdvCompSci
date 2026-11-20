public class ParseTools {
    public static double toDouble(String text){
        return Double.parseDouble(text);
    }

    public static String describeChar(char value){
        if (Character.isDigit(value) == true){
            return "digit";
        }
        else if (Character.isLetter(value) == true){
            return "letter";
        }
        else {
            return "other";
        }
    }

    public static boolean isInteger(String text){
        if (text == null){
            return false;
        }

        if (text.isEmpty() == true){
            return false;
        }

        int start = 0;
        if (text.charAt(0) == '-'){
            start = 1;
            if (text.length() == 1){
                return false;
            }
        }


        for (int i = start; i < text.length(); i++){

            if (Character.isDigit(text.charAt(i)) == false){
                return false;
            }
        }

        return true;
        
    }

    public static Integer parseOrNull(String text){
        if (isInteger(text) == true){
            return Integer.parseInt(text);
        }

        return null;
        }

    
    }

