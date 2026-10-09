public class LaunchRulesTester {
    public static void main(String[] args) {
        LaunchRules rules = new LaunchRules();

        int wind = 19;
        boolean clear = true;
        System.out.println("isScrubbed(" + wind + ", " + clear + "): "
                + rules.isScrubbed(wind, clear)
                + " | first draft: " + !(wind < 20 && clear));        
        
        wind = 20;
        clear = true;
        System.out.println("isScrubbed(" + wind + ", " + clear + "): "
                + rules.isScrubbed(wind, clear)
                + " | first draft: " + !(wind < 20 && clear));

        wind = 19;
        clear = false;
        System.out.println("isScrubbed(" + wind + ", " + clear + "): "
                + rules.isScrubbed(wind, clear)
                + " | first draft: " + !(wind < 20 && clear));
                
        wind = 30;
        clear = false;
        System.out.println("isScrubbed(" + wind + ", " + clear + "): "
                + rules.isScrubbed(wind, clear)
                + " | first draft: " + !(wind < 20 && clear));


        System.out.println("isGo(false, true): " + rules.isGo(false, true));

        System.out.println("canLaunch(19, false, true, false): "
                 + rules.canLaunch(19, false, true, false));

        System.out.println("notBothPositive(3, 4): " + rules.notBothPositive(3, 4));

        int temp = 95;
        boolean spark = false;
        System.out.println("canFuel(" + temp + ", " + spark + "): "
                 + rules.canFuel(temp, spark)
                 + " | first draft: " + (temp <= 95 && !spark));

        temp = 96;
        spark = false;
        System.out.println("canFuel(" + temp + ", " + spark + "): "
                 + rules.canFuel(temp, spark)
                 + " | first draft: " + (temp <= 95 && !spark));
        
        temp = 70;
        spark = true;
        System.out.println("canFuel(" + temp + ", " + spark + "): "
                 + rules.canFuel(temp, spark)
                 + " | first draft: " + (temp <= 95 && !spark));
        temp = 60;
        spark = false;
        System.out.println("canFuel(" + temp + ", " + spark + "): "
                 + rules.canFuel(temp, spark)
                 + " | first draft: " + (temp <= 95 && !spark));

        // System.out.println("isHold(19, true, false, true): "
        //         + rules.isHold(19, true, false, true));
    }
}
