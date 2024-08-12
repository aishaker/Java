import java.util.*;

@SuppressWarnings("rawtypes")
class Point implements Comparable{
    int x,y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "X = "+x+" Y = "+y;
    }

    public int compareTo(Object o){
        Point p = (Point)o;
        if(this.x<p.x){
            return -1;
        }
        else if(this.x>p.x){
            return 1;
        }
        else{
            if(this.y<p.y){
                return -1;
            }
            else if(this.y>p.y){
                return 1;
            }
            else{
                return 0;
            }
        }
    }

}
public class comparable {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1,1));
        ts.add(new Point(1,7));
        ts.add(new Point(1,3));
        ts.add(new Point(3,1));
        ts.add(new Point(2,3));

        System.out.println(ts);
    }
}
