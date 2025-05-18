package Activity_selecton;

import java.util.Comparator;

public class Asp_Comparator implements Comparator<Activity> {

    @Override
    public int compare(Activity o1, Activity o2) {
        if(o1.getFinish()<= o2.getFinish()) return -1;
                else return 1;
    }
    
}
