package mx.tc.j2se.tasks;

public class TaskImpl implements Task{

    String title;
    int time, startTime, endTime, interval, next, dif;
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
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean isActive() {
        return this.status;
    }

    @Override
    public void setActive(boolean active) {
        this.status = active;
    }

    @Override
    public int getTime() {
        if(this.isRepeated()){
            return this.startTime;
        }
        else{
            return this.time;
        }
    }

    @Override
    public void setTime(int time) {
        if(this.isRepeated()){
            this.repetitive = false;
        }
        this.time = time;
    }

    @Override
    public int getStartTime() {
        if(this.isRepeated()){
            return this.startTime;
        }
        else{
            return this.time;
        }
    }

    @Override
    public int getEndTime() {
        if(this.isRepeated()){
            return this.endTime;
        }
        else{
            return this.time;
        }
    }

    @Override
    public int getRepeatInterval() {
        if(this.isRepeated()){
            return this.interval;
        }
        else{
            return 0;
        }
    }

    @Override
    public void setTime(int start, int end, int interval) {
        this.startTime = start;
        this.endTime = end;
        this.interval = interval;
        this.repetitive = true;
    }

    @Override
    public boolean isRepeated() {
        return this.repetitive;
    }

    @Override
    public int nextTimeAfter(int current) {
        if(current>this.getTime() && !this.isRepeated() || current>this.getEndTime()){
            this.setActive(false);
        }
        if(this.isActive()){
            if(this.isRepeated()){
                if(current<this.getStartTime()){
                    next = this.getStartTime() - current;
                }
                else if(current>this.getStartTime() && current<this.getEndTime()){
                    dif = this.getStartTime();
                    while(current>=dif){
                        dif += this.interval;
                    }
                    next = dif - current;
                }
            }
            else{
                if(current<this.time) {
                    next = this.time - current;
                }
            }
            return next;
        }
        else {
            return -1;
        }
    }
}
