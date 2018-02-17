package creational.builder;

public class Dress {

    private DressType typeOfDress;

    public Dress() {
    }

    public Dress(DressType typeOfDress) {
        this.typeOfDress = typeOfDress;
    }


    public DressType getTypeOfDress() {
        return typeOfDress;
    }

    public void setTypeOfDress(DressType typeOfDress) {
        this.typeOfDress = typeOfDress;
    }

    public void sewSleeves() {
        System.out.println("Шьём рукава");
    }

    public void sewBasePart() {
        System.out.println("Шьём основную часть");
    }

    public void decorate() {
        System.out.println("Декорируем");
    }
}
