package com.example.toDo;

import java.util.ArrayList;
import java.util.List;

public class StaticDao implements TaskDao {

    private static List<Task> tasks = new ArrayList<>();

    @Override
    public List<Task> findAll(){
        return tasks;
    }
    @Override
    public void addTask(Task task){
        tasks.add(task);

    }

    @Override
    public List<Task> findByStatus(boolean finished) {
        List<Task> scores = new ArrayList<>();
        for ( Task task: tasks){
            if (task.isFinished() == finished)
                scores.add(task);
        }
        return scores;
    }

}
