package Pacage;

import java.util.*;




public class ASP {



    public static ArrayList<Activites> maximumActivities(ArrayList<Activites> Ar)
    {
        Ar.sort(new Asp_Comparator());
        int previous=-1;
        ArrayList<Activites>B=new ArrayList<>();
        for(Activites x:Ar)
        {
            if(x.getStart()> previous) 
            {
                previous=x.getFinish();
                B.add(x);
            }
        }
        return  Ar;
    }





    
        

}

