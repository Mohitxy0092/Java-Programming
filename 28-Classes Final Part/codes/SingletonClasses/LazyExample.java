package SingletonClasses;

public class LazyExample {
    private static LazyExample instance;
    private LazyExample() {}

    public static LazyExample getInstance() {
        if(instance==null) {
            instance=new LazyExample();
        }
        return instance;
    }
}
