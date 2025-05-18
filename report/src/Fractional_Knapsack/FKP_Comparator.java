package Fractional_Knapsack;

import java.util.Comparator;

public class FKP_Comparator implements Comparator<Item>{

    @Override
    public int compare(Item o1, Item o2) {
        if(o1.getRatio()>= o2.getRatio()) return -1;
        return 1;
    }
    
}
