package creational.builder.dressBuilder;

import creational.builder.Dress;
import creational.builder.dressBuilder.DressMaker;

/**
 * Created by Dasha on 17.02.2018.
 */
public class EveningDressMaker extends DressMaker {

    public EveningDressMaker() {
        this.dress = new Dress();
    }

    @Override
    public Dress makeDress() {
        System.out.println("Пошив вечернего платья: ");
        dress.sewBasePart();
        dress.sewSleeves();
        dress.decorate();
        return dress;
    }
}
