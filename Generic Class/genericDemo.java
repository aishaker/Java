
class Data<T>{
    private T obj;

    public void setData(T v){
        obj = v;
    }
    public T getData(){
        return obj;
    }
}
public class genericDemo {
    public static void main(String[] args) {
        // Data<String> d = new Data<>();
        // d.setData("Hello");
        Data<Integer> d = new Data<>();
        d.setData(20);
        System.out.println(d.getData());
    }
}
