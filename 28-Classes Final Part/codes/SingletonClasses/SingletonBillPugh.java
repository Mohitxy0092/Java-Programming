package SingletonClasses;

public class SingletonBillPugh {
    private SingletonBillPugh() {}
    private static class instanceHelper {
        private static final SingletonBillPugh instance= new SingletonBillPugh();
    }
    public static SingletonBillPugh getInstance(){
        return instanceHelper.instance;
    }
}
