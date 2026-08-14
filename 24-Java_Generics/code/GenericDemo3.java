class Data <T> {
    private T obj;
    public void setData(T obj) {
        this.obj=obj;
    }
    public T getData() {
        return obj;
    }
}
public class GenericDemo3 {
    public static void main(String[] args) {
        Data<Integer> d=new Data<>();
        d.setData(10);
        System.out.println(d.getData());
        Data<String> d2=new Data<String>();//new Data<>(); both are correct;
        d2.setData("Hello");
        System.out.println(d2.getData());
    }
}