package cs603.hw1;
import java.util.Calendar;

public class Task {
    private String name;
    private Calendar deadline;

    Task(String name, Calendar deadline){
        setName(name);
        setDeadLine(deadline);
    }

    private void setName(String name){
        this.name = name;
    }

    private void setDeadLine(Calendar deadline){
        this.deadline = deadline;
    }

    String getTaskName(){
        return name;
    }

    Calendar getDeadLine(){
        return deadline;
    }

}
