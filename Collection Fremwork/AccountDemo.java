import java.io.*;
import java.util.*;

class Accounts implements Serializable{
    String accNo,name;
    double balance;
    public Accounts(){}
    public Accounts(String a, String n,double b){
        accNo = a;
        name = n;
        balance = b;
    }

    public String toString(){
        return "Account No: "+accNo+"\nName: "+name+"\nBalance: "+balance;
    }
}

public class AccountDemo {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        Accounts acc = null;
        HashMap<String,Accounts> hm = new HashMap<>();

        try {

            FileInputStream fis = new FileInputStream("C:/Users/Ai_Shaker/Desktop/GitDemo/Java/Collection Fremwork/account.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int cnt = ois.readInt();
            for(int i=0; i<cnt; i++){
                acc = (Accounts)ois.readObject();
                System.out.println(acc);
                hm.put(acc.accNo, acc);
            }
            fis.close();
            ois.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }


        FileOutputStream fos = new FileOutputStream("C:/Users/Ai_Shaker/Desktop/GitDemo/Java/Collection Fremwork/account.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Menue");

        int choice;
        String accNo,name;
        double balance;

        do {
            System.out.println("1: Create a Account");
            System.out.println("2: Delete Accounts");
            System.out.println("3: View Accounts");
            System.out.println("4: View all Accounts");
            System.out.println("5: Sava Accounts");
            System.out.println("6: Exit");
            System.out.println();
            choice = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            switch (choice) {
                case 1:
                    System.out.println("Enter Accounts Deteils");
                    accNo = sc.nextLine();
                    name = sc.nextLine();
                    balance = sc.nextDouble();
                    acc = new Accounts(accNo, name, balance);
                    hm.put(accNo, acc);
                    System.out.println("Account Created for "+name+"\n\n");
                    break;
                case 2:
                    System.out.println("Account no which you want to delete");
                    accNo = sc.nextLine();
                    hm.remove(accNo);
                    break;
                case 3:
                    System.out.println("Account no which you want to view");
                    accNo = sc.nextLine();
                    acc = hm.get(accNo);
                    System.out.println(acc);
                    System.out.println();
                    break;
                case 4:
                    for(var x:hm.values()){
                        System.out.println(x);
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 5:
                case 6:
                    oos.writeInt(hm.size());
                    for(var x:hm.values()){
                        System.out.println(x);
                    }
                    break;
            }
        } while (choice !=5);
        oos.flush();
        oos.close();
        fos.close();

    }
}
