import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
public class PropertyDemo {

    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        // p.setProperty("Brand","Asus");
        // p.setProperty("Processor","Raizen7");
        // p.setProperty("OS","Windows 11");
        // p.setProperty("Model","Zenbook 14");
        // p.store(new FileOutputStream("C:/Users/Ai_Shaker/Desktop/Java/mydata.txt"), "Leptop");
        p.load(new FileInputStream("C:/Users/Ai_Shaker/Desktop/Java/mydata.txt"));
        System.out.println(p);
    }
}