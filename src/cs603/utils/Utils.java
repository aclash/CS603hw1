package cs603.utils;
import java.util.List;
import java.util.Comparator;

public class Utils {
    public static <T> void sort(List<T> list, Comparator<? super T> cmp) {
        //insertion sort
        for (int i = 1; i < list.size(); ++i) {
            int j = i - 1;
            T key = list.get(i);
            while (j >= 0 && cmp.compare(list.get(j), key) > 0) {
                list.set(j + 1, list.get(j));
                --j;
            }
            list.set(j + 1, key);
        }
    }
}
