package creational.builder;


import creational.builder.dressBuilder.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(DressType.EVENING);
        director.makeDress();
        Director director1 = new Director(DressType.CASUAL);
        director1.makeDress();
    }
}
