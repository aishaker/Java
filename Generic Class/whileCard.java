
public class whileCard {
    static void show(MyArray<String> m1){
        m1.display();
    }
    public static void main(String[] args) {
        MyArray<String> m1 = new MyArray<>();
        m1.append("Shaker");
        m1.append("Mahfuz");
        m1.append("Rifat");
        MyArray<String> m2 = new MyArray<>();
        m2.append(10);
        m2.append(50);
        m2.append(100);
        show(m2);
        show(m1);
    }
}