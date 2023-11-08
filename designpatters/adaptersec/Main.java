package designpatters.adaptersec;

public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Itarget target = new Adapter(adaptee);
        target.request();
    }
}
