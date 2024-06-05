package FactoryDesignPattern;

public class PenAdapter implements Pen{

    BluePen bluePen = new BluePen();

    @Override
    public void writeThings(String str) {
        bluePen.marks(str);


    }
}
