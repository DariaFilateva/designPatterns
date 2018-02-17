package creational.builder.dressBuilder;


import creational.builder.Dress;

public abstract class DressMaker {
    protected Dress dress;

    public abstract Dress makeDress();
}
