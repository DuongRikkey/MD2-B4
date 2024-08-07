package OOP.EX3;

public class STOPWATCH {
    private long startTime;
    private long endTime;

    public  STOPWATCH (){
        this.startTime = 0;
        this.endTime = 0;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }

        }

