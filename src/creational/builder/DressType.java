package creational.builder;

public enum DressType {

    EVENING("evening"),
    CASUAL("casual");

    private final String type;

    private DressType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
