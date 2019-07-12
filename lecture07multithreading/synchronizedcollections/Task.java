package kz.epam.khassenov.lecture07multithreading.synchronizedcollections;

import java.util.Random;

public class Task implements Comparable<Task> {
    private int taskNumber;

    public Task(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public int compareTo(Task o) {
        Random random = new Random();
        int comp = random.nextInt(2000);
        if (comp % 2 == 0) return 1;
        if (comp % 3 == 0) return -1;
        else return 0;
    }
}
