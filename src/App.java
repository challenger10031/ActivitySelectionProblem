import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s);
        s=s.concat("abc");
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+" ");
        }
        
    }
}
