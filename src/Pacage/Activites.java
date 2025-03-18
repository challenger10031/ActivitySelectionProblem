package Pacage;

public class Activites {
    private String name;
    private int Start;
    private int Finish;
    Activites(String s,int a,int b)
    {
        name=s;
        Start=a;
        Finish=b;
    }
    public String getName() {
        return name;
    }
    public int getStart() {
        return Start;
    }
    public int getFinish() {
        return Finish;
    }
    @Override
    public String toString() {
        return "Activites [name=" + name + ", Start=" + Start + ", Finish=" + Finish + "]";
    }
}
