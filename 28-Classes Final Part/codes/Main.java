import SingletonClasses.*;

public class Main {

    public static void main(String[] args) {
        callEager();
        callLazy();
        callSynchronized();
        callDoubleChecked();
        callBillPugh();
    }

    private static void callEager() {
        SingletonEagerExample instance1 =
                SingletonEagerExample.getInstance();

        SingletonEagerExample instance2 =
                SingletonEagerExample.getInstance();

        System.out.println("Eager: " + (instance1 == instance2));
    }

    private static void callLazy() {
        LazyExample instance1 = LazyExample.getInstance();

        LazyExample instance2 = LazyExample.getInstance();

        System.out.println("Lazy: " + (instance1 == instance2));
    }

    private static void callSynchronized() {
        SingletonSynchronized instance1 =
                SingletonSynchronized.getInstance();

        SingletonSynchronized instance2 =
                SingletonSynchronized.getInstance();

        System.out.println("Synchronized: " + (instance1 == instance2));
    }

    private static void callDoubleChecked() {
        DoubleChecked instance1 =DoubleChecked.getInstance();

        DoubleChecked instance2 =DoubleChecked.getInstance();

        System.out.println("Double Checked: " + (instance1 == instance2));
    }
    private static void callBillPugh() {
        SingletonBillPugh instance1 =
                SingletonBillPugh.getInstance();

        SingletonBillPugh instance2 =
                SingletonBillPugh.getInstance();

        System.out.println("Bill Pugh: " + (instance1 == instance2));
    }
}
