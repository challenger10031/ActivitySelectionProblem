package Pacage;
import java.util.*;
public class Main {
    public static void main(String[] args) {

            int n = 6;
            

            ArrayList<Activites> list= new ArrayList<>();
            list.add(new Activites("A1", 0, 6));
            list.add(new Activites("A2", 3, 4));
            list.add(new Activites("A3", 1, 2));
            list.add(new Activites("A4", 5, 9));
            list.add(new Activites("A5", 5, 7));
            list.add(new Activites("A6", 8, 9));
            /* 
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            for(int i=0;i<n;i++) 
            {
                int x,y;
                String s=" A";
                System.out.println("Start time,  End time,   Name:- ");
                x=sc.nextInt(); 
                y=sc.nextInt();
                s=sc.nextLine();
                Ar.add(new Activites(s, x, y));
            }
            */
            ArrayList<Activites>B=ASP.maximumActivities(list);
            for(Activites x: B) System.out.print(x.getName()+" ");
    }
}
