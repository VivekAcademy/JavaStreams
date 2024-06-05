package InterviewCoding;

public class Singeleton {

    private Singeleton() {
    }


    private static class SingeletonHolder{

        private static final Singeleton instance = new Singeleton();

    }
    
    public static Singeleton getInstance(){
        return SingeletonHolder.instance;

    }
}
