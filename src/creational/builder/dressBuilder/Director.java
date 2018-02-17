package creational.builder.dressBuilder;

import creational.builder.Dress;
import creational.builder.DressType;

public class Director {
    private DressMaker dressMaker;

    public Director(DressType dressType) {
        if (dressType.getType().equals(DressType.CASUAL.getType())) {
            dressMaker = new CasualDressMaker();
        }
        if (dressType.getType().equals(DressType.EVENING.getType())) {
            dressMaker = new EveningDressMaker();
        }
    }

    public Dress makeDress() {
        return dressMaker.makeDress();
    }
}
