public class GenericMethod {

    static <A> void show(A[] list){
        for(A i:list){
            System.out.print(i+" ");
        }
        System.out.println();
    } 
    static <A extends Number> void print(A... list){
        for(A i:list){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        show(new String[]{"hello","bye","go"});
        print(new Integer[]{10,20,30,40});
    }
}
