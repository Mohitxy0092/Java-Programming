class Data <T> {
    private T obj;
    public void setData(T obj) {
        this.obj=obj;
    }
    public T getData() {
        return obj;
    }
}
class subPrint extends Data<String>{

}
public class Main{
    public static void main(String[] args){
        subPrint s1=new subPrint();
        s1.setData("Hello");
        System.out.println(s1.getData());
    }
}
