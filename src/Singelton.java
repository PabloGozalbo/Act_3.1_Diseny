public class Singelton {
    private static Singelton instance;

    private Singelton(){}

    private static Singelton getInstance(){
        if (instance==null)
            instance=new Singelton();
        return instance;
    }
}
