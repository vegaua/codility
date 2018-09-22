package testTask;

import java.util.List;

public class RevertList<T> {

    public List<T> revertList(List<T> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            T a = list.get(i);
            T b = list.get(list.size() - i - 1);
            list.set(i, b);
            list.set(list.size() - i - 1, a);
        }
        return list;
    }
}
