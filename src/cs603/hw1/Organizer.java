package cs603.hw1;
import cs603.utils.Utils;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Organizer {

    private List<Task> tasks;

    Organizer(){
        tasks = new ArrayList<Task>();
    }

    void addTask(Task task){
        tasks.add(task);
    }

    List<Task> getTasks(){
        return tasks;
    }

    void sortTasks( Comparator<Task> cmp){
        Collections.sort(tasks, cmp);
    }

    void mySortTasks(Comparator<Task> cmp){
        Utils.sort(tasks, cmp);
    }
}
