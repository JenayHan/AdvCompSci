public class RareFish extends Fish {
    private String origin;

    // REQ 12
    public RareFish(String name, String species, String origin) {
        super(name, species);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    // REQ 13
    public String toString() {
        String descriptionOfRareFish = super.toString() + " from " + origin;
        return descriptionOfRareFish;
    }
}
