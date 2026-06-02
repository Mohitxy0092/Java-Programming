import java.util.TreeSet;

class Point implements Comparable{
    int x,y;
    public Point(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "x : "+x + " y : "+y + "\n";
    }
    public int compareTo(Object o){
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
        if(this.y<p.y) 
            return -1;
        else if(this.y>p.y)
            return 1;
        else 
            return 0;
        }
    }
}
public class Treesetpractice {
    public static void main(String[] args) {
        TreeSet<Point>ts=new TreeSet<Point>();
        ts.add(new Point(5,1));
        ts.add(new Point(1,2));
        ts.add(new Point(5, 5));
        System.out.println(ts);
    }
}
