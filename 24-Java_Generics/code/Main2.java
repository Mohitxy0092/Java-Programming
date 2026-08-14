class Data <T> {
    private T obj;
    public void setData(T obj) {
        this.obj=obj;
    }
    public T getData() {
        return obj;
    }
}
class subPrint<T> extends Data<T>{
    public subPrint() {
        super.setData();
    }
}
public class Main2{
    public static void main(String[] args){
        subPrint<String> s1=new subPrint<>();
        s1.setData("Hello");
        System.out.println(s1.getData());
    }
}