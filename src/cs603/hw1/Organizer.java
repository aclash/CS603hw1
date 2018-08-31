package cs603.hw1;
import cs603.utils.Utils;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Organizer<T> {

    private List<T> tasks;

    Organizer(){
        tasks = new ArrayList<T>();
    }

    void addTask(T task){
        tasks.add(task);
    }

    List<T> getTasks(){
        return tasks;
    }

    void sortTasks( Comparator<T> cmp){
        Collections.sort(tasks, cmp);
    }

    void mySortTasks(Comparator<T> cmp){
        Utils.sort(tasks, cmp);
    }
}
