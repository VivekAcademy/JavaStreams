package FactoryDesignPattern;

public class FactoryDesign {

    public OS methodImpl(String type){
        if(type.equalsIgnoreCase("Android")){
            return new Android();

        }
        else {
            return new IOS();
        }
    }

}
