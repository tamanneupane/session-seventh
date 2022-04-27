package day20;

public enum Size {
    SMALL("1"), MEDIUM("2"), LARGE("3"), EXTRA_LARGE("4");

    private final String abbr;

    Size(String abbr){
        this.abbr = abbr;
    }

    public String getAbbr() {
        return abbr;
    }
}
