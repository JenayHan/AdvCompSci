public class LaunchRules {


    public boolean isScrubbed(int windMph, boolean skyClear) {
        return windMph >= 20 || !skyClear;
    }

    public boolean isGo(boolean abortCalled, boolean ignitionOk) {
        return !abortCalled && ignitionOk;
    }

    public boolean canLaunch(int windMph, boolean abortCalled,
            boolean ignitionOk, boolean backupLoaded) {
        return windMph < 20 && !abortCalled && (ignitionOk || backupLoaded);
    }

    public boolean notBothPositive(int x, int y) {
        return !(x>0 && y>0);
    }

    public boolean canFuel(int tempF, boolean sparkNearby) {
        return !(tempF > 95 || sparkNearby);
    }

    public boolean isHold(int windMph, boolean skyClear,
            boolean abortCalled, boolean rangeSafe) {
        return !(windMph < 20 && skyClear && !abortCalled && rangeSafe);
    }
}
