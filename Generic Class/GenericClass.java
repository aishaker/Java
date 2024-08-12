class A{}
interface B{}
interface C{}

class test extends A implements B, C { }

class Araay<T extends A & B & C>{
    T A[] = (T[]) new Object[10];
    int n=0;
    public void append(T v){
        A[n++] = v;
    }

    void display(){
        for(int i=0; i<n; i++){
            System.out.println(A[i]+" ");
        }
        System.out.println();
    }
}

// class Array1<T> extends Araay<A>{

// }

public class GenericClass {
    public static void main(String[] args) {
        Araay<test> a = new Araay<>();
        // a.append(10);
        // a.append("hello");
        // a.append("bye");
        // a.display();

        
    }
}
