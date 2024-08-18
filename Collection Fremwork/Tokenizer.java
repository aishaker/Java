import java.io.*;
import java.util.*;
public class Tokenizer {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/Ai_Shaker/Desktop/GitDemo/Java/Collection Fremwork/data.txt");
        // FileInputStream fis = new FileInputStream("C:/Users/Ai_Shaker/Desktop/GitDemo/Java/Collection Fremwork/mydata.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String data=new String(b);
        ArrayList<Integer> al = new ArrayList<>();
    
        // String data = "Name=Shaker Address=Netrokona Country=Bangladesh Dept=CSE";
        StringTokenizer stk = new StringTokenizer(data,",");
        // StringTokenizer stk = new StringTokenizer(data,"=");
        String s;
        while(stk.hasMoreElements()){
            s=(String) stk.nextElement();
            al.add(Integer.valueOf(s));
        }
        System.out.println(al);
        
    }
}