@SuppressWarnings("unchecked")
class MyArray<T>{
    T A[] = (T[]) new Object[10];
    int length = 0;
    public void append(T v){
        A[length++] = v;
    }

    public void display(){
        for(int i=0; i<length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}

public class GenericArray {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //MyArray<Integer> my = new MyArray<>();
        // my.append(10);
        // my.append(20);
        // my.append(30);
        // my.display();
        // my.append(40);
        // my.append(50);
        // my.display();
        @SuppressWarnings("rawtypes")
        MyArray ma = new MyArray<>();
        ma.append("Shaker");
        ma.append(20);
        ma.append("Rifat");
        ma.display();
        System.out.println(ma.length);
    }
}
