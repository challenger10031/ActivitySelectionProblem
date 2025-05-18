package Activity_selecton;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static ArrayList<Activity> maximumActivities(ArrayList<Activity> Ar)
    {
        Ar.sort(new Asp_Comparator());
        int previous=-1;
        ArrayList<Activity>B=new ArrayList<>();
        for(Activity x:Ar)
        {
            if(x.getStart()> previous) 
            {
                previous=x.getFinish();
                B.add(x);
            }
        }
        return  Ar;
    }


    public static void main(String[] args) {
        ArrayList<Activity> list= new ArrayList<>();
            list.add(new Activity("A1", 0, 6));
            list.add(new Activity("A2", 3, 4));
            list.add(new Activity("A3", 1, 2));
            list.add(new Activity("A4", 5, 9));
            list.add(new Activity("A5", 5, 7));
            list.add(new Activity("A6", 8, 9));
        ArrayList<Activity> A=maximumActivities(list);
        for(Activity x: A) System.out.print(x.getName()+" ");
    }
}

