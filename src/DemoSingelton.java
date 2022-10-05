public class DemoSingelton {
    public static void main(String[] args) {
        Singelton instance1 = Singelton.getInstance();
        System.out.println(instance1);
        Singelton instance2 = Singelton.getInstance();
        System.out.println(instance2);
    }
}
