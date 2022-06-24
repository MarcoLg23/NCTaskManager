package mx.tc.j2se.tasks;

public class TaskImpl implements Task{

    String title;
    int time, startTime, endTime, interval;
    boolean status, repetitive;

    public TaskImpl(){
    }

    public TaskImpl(String title, int time){
        setTitle(title);
        setTime(time);
        setActive(true);
    }

    public TaskImpl(String title, int start, int end, int interval){
        setTitle(title);
        setTime(start, end, interval);
        setActive(true);
        this.repetitive = true;
    }





    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean isActive() {
        return status;
    }

    @Override
    public void setActive(boolean active) {
        status = active;
    }

    @Override
    public int getTime() {
        if(repetitive)
            return startTime;
        else
            return time;
    }

    @Override
    public void setTime(int time) {
        if(repetitive)
            repetitive = false;
        this.time = time;
        status = true;
    }

    @Override
    public int getStartTime() {
        if(repetitive)
            return startTime;
        else
            return time;
    }

    @Override
    public int getEndTime() {
        if(repetitive)
            return endTime;
        else
            return time;
    }

    @Override
    public int getRepeatInterval() {
        if(repetitive)
            return interval;
        else
            return 0;
    }

    @Override
    public void setTime(int start, int end, int interval) {
        startTime = start;
        endTime = end;
        this.interval = interval;
        repetitive = true;
        status = true;
    }

    @Override
    public boolean isRepeated() {
        return repetitive;
    }

    @Override
    public int nextTimeAfter(int current) {
        if(current>=0 && status){
            if(repetitive){
                if(startTime>current)
                    return startTime;
                else if (endTime>current) {
                    int next = startTime;
                    while(next<=current)
                        next += interval;
                    if (next<=endTime)
                        return next;
                    else
                        return -1;
                }
                else
                    return -1;
            }
            else {
                if (time>current)
                    return time;
                else
                    return -1;
            }
        }
        else
            return -1;
    }
}
