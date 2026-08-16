package SingletonClasses;

public class SingletonEagerExample {
    private static final SingletonEagerExample instance=new SingletonEagerExample();

    private SingletonEagerExample() {}

    public static SingletonEagerExample getInstance(){
        return instance;
    }
}
