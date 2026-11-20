public class WaterUtils {

    // REQ 02
    public static boolean isSafeTemp(double celsius) {
        if (celsius >= 24.0 && celsius <= 27.0){
            return true;
        }

        else {
            return false;
        }
    }

    // REQ 03
    public static boolean isSafeTemp(String reading) {
        return isSafeTemp(Double.parseDouble(reading));
    }


}
