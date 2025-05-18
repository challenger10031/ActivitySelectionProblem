package Fractional_Knapsack;

public class Item {
    private double object;
    private double profit;
    private double weight;
    private double ratio;
    public Item(double object, double profit, double weight) {
        this.object = object;
        this.profit = profit;
        this.weight = weight;
        this.ratio  = profit/weight;
    }
    public double getObject() {
        return object;
    }
    public double getProfit() {
        return profit;
    }
    public double getWeight() {
        return weight;
    }
    public double getRatio() {
        return ratio;
    }
   
    
}
