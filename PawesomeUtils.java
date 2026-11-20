public class PawesomeUtils {
    public static char generateDogChar(int dogId){
        int sum = 0;
        char letter = 0;
        sum = (dogId % 10) + (dogId / 10) % 10 + (dogId / 100) % 10;
        letter = (char)(sum % 10 + 70);
        return letter;
    }

    public static String generateDogTag(int dogId, char dogChar){
            String tag = "";
            tag = "" + dogId + dogChar;
            return tag;
        }

    public static int validateDogId(int dogId){
        if (dogId <= 999 && dogId >= 100){
            return dogId;
        }
        else {
            dogId = (int)(Math.random()* 900 + 100);
        }
        return dogId;
    }

    public static boolean hasValidTag(Dog dog){
        if (dog == null){
            return false;
        }

        if (generateDogTag(dog.getDogId(),
         generateDogChar(dog.getDogId())).equals(dog.getDogTag())){
            return true;
        }
        else {
            return false;
        }
    }

    public static String pickup(Dog dog, String person){
        if (dog == null){
            return "There is no dog.";
        }
        
        if (person.equals(dog.getOwnerName())){
            dog.setStillInFacility(false);
            return "You are their owner, so they can leave.";
        }
        else {
            dog.setStillInFacility(true);
            return "You are not their owner, so they cannot leave.";
        }
    }

    public static int convertAgeToHumanAge(Dog dog){
        if (dog.getAge() == 1){
            return 15;
        }
        else if (dog.getAge() == 2){
            return 24;
        }
        else {
            return (dog.getAge()-2)*5 + 24;
        }
    }

    public static int convertAgeToDogYears(int humanYears){
        if (humanYears <= 15){
            return 1;
        }
        else if (humanYears <= 24){
            return 2;
        }
        else {
            return ((humanYears - 24)/5) * 1 + 2;
        }
    }






}
