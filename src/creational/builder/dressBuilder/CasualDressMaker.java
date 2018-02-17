package creational.builder.dressBuilder;

import creational.builder.Dress;

public class CasualDressMaker extends DressMaker {

    public CasualDressMaker() {
        this.dress = new Dress();
    }

    @Override
    public Dress makeDress() {
        System.out.println("Пошив повседневного платья:");
        dress.sewBasePart();
        return dress;
    }
}
