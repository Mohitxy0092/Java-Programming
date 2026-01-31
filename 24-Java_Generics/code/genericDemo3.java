class Data <T> {
    private T obj;
    public void setData(T obj) {
        this.obj=obj;
    }
    public T getData() {
        return obj;
    }
}
public class genericDemo3 {
    public static void main(String[] args) {
        Data<Integer> d=new Data<>();
        d.setData(10);
        d.setData(20);
        System.out.println(d.getData());
    }
}
