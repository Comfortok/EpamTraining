package kz.epam.khassenov.lecture07multithreading.waitnotify;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {
    private List<Integer> list;

    public SharedResource() {
        list = new ArrayList<>();
    }

    public Integer getElement() {
        if (list.size() > 0){
            return list.remove(0);
        }
        return null;
    }

    public void setElement(Integer element) {
        list.add(element);
    }
}
