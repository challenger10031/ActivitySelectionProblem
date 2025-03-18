package Pacage;

import java.util.Comparator;

public class Asp_Comparator implements Comparator<Activites> {

    @Override
    public int compare(Activites o1, Activites o2) {
        // TODO Auto-generated method stub
        if(o1.getFinish()<= o2.getFinish()) return -1;
                else return 1;
    }
    
}
