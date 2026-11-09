
public class StepTracker{
    private boolean active;
    private int activenum;
    private int steps;
    private int minsteps;
    private int daystracked;
    public StepTracker(int minsteps){
        this.minsteps = minsteps;
        steps = 0;
        active = true;
        activenum = 0;
        daystracked = 0;
    }

    public boolean addDailySteps(int num){
        if(steps + num >= minsteps){
            steps = steps + num;
            activenum++;
            daystracked++;
            return active == true;
        }
        else{
            steps = steps + num;
            daystracked++;
            return active = false;
        }
    }

    public int activeDays(){
        return activenum;
    }
    
    public double averageSteps(){
        return ((double)(steps))/daystracked;
    }






}