package cs603.hw1;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
public class Hw1Driver {

    public static void main(String[] args) {
        Organizer<Task> org = new Organizer();

        for (int i = 0; i < 10; ++i) {
            String name = "task" + (9 - i);
            int day = i + 1;
            Calendar date = Calendar.getInstance();
            date.setTime(new Date(2018, 1, day, 23, 59, 59));
            //date.set(2018, 1, day, 23, 59, 59);
            org.addTask(new Task(name, date));
        }

        Calendar date = Calendar.getInstance();
        date.setTime(new Date(2018, 1, 1, 23, 59, 59));
        //date.set(2018, 1, day, 23, 59, 59);
        org.addTask(new Task("task" + 10, date));


        //before sort
        System.out.println("Before Sort");
        org.getTasks().forEach((task) -> System.out.printf("%s: %s\n", task.getTaskName(), task.getDeadLine().getTime()));

        //using library's sort
        System.out.println("After sort by Name");
        Comparator<Task> byName = (Task o1, Task o2)->o1.getTaskName().compareTo(o2.getTaskName());
        org.sortTasks(byName);
        org.getTasks().forEach((task) -> System.out.printf("%s: %s\n", task.getTaskName(), task.getDeadLine().getTime()));

        System.out.println("After sort by Deadline then by Name");
        Comparator<Task> byDeadLine = (Task o1, Task o2)->(o1.getDeadLine().compareTo(o2.getDeadLine()));
        org.sortTasks(byDeadLine.thenComparing(byName));
        org.getTasks().forEach((task) -> System.out.printf("%s: %s\n", task.getTaskName(), task.getDeadLine().getTime()));

        //using my sort
        System.out.println("After sort by Name");
        org.mySortTasks(byName);
        org.getTasks().forEach((task) -> System.out.printf("%s: %s\n", task.getTaskName(), task.getDeadLine().getTime()));

        System.out.println("After sort by Deadline then by Name");
        org.mySortTasks(byDeadLine.thenComparing(byName));
        org.getTasks().forEach((task) -> System.out.printf("%s: %s\n", task.getTaskName(), task.getDeadLine().getTime()));
    }
}
