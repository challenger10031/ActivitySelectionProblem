package Activity_selecton;

public class Activity {
    private String Name;
    private int start;
    private int finish;
    public String getName() {
        return Name;
    }
    public int getStart() {
        return start;
    }
    public int getFinish() {
        return finish;
    }
    public Activity(String name, int start, int finish) {
        Name = name;
        this.start = start;
        this.finish = finish;
    }
    
}
