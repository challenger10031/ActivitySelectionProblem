package Fractional_Knapsack;

import java.util.ArrayList;

public class Main {

    static double getMaxValue(ArrayList<Item> list, int capacity)
    {
        double totalProfit=0;
        list.sort(new FKP_Comparator());
        for(Item x:list)
        {
            double y;
            if(capacity < x.getWeight()) y=capacity;
            else y=x.getWeight();
            totalProfit+= y*x.getRatio();
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int capacity=45;
        ArrayList<Item> list =new ArrayList<>();
        list.add(new Item(1, 60, 12));
        list.add(new Item(2, 100, 24));
        list.add(new Item(3, 110, 30));
        list.add(new Item(4, 50, 30));
        
    }
}
