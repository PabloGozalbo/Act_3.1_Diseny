public class DemoSingelton {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Singelton instance1 = Singelton.getInstance();
        System.out.println(System.currentTimeMillis());
        System.out.println(instance1);
        System.out.println(System.currentTimeMillis());
        Singelton instance2 = Singelton.getInstance();
        System.out.println(System.currentTimeMillis());
        System.out.println(instance2);
    }
}
