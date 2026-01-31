@SuppressWarnings("unchecked")
class myArray <T> {

    T []obj=(T [])new Object[10];
    int length=0;

    public void append(T data) {
        obj[length++]=data;
    }
    public void Display() {
        for(int i=0;i<length;++i) {
            System.out.println(obj[i]);
        }
    }
}
public class genericArrayDemo {
    public static void main(String[] args) {
        // myArray<Integer> t=new myArray<>();
        myArray t=new myArray();
        t.append(10);
        t.append(20);
        t.append(30);
        t.Display();
        t.append("Hello");// cant do it;

    }
}
