package mx.tc.j2se.tasks;

public class TaskImpl implements Task{
    public TaskImpl(){

    }

    public TaskImpl(String title, int time){

    }

    public TaskImpl(String title, int start, int end, int interval){

    }



    String title;
    int time;

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
        return false;
    }

    @Override
    public void setActive(boolean active) {

    }

    @Override
    public int getTime() {
        return 0;
    }

    @Override
    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int getStartTime() {
        return 0;
    }

    @Override
    public int getEndTime() {
        return 0;
    }

    @Override
    public int getRepeatInterval() {
        return 0;
    }

    @Override
    public void setTime(int start, int end, int interval) {

    }

    @Override
    public boolean isRepeated() {
        return false;
    }
}
