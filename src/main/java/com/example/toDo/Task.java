package com.example.toDo;

public class Task {

    private String name;
    private String description;
    private boolean isFinished;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public Task(String name, String description, boolean isFinished) {
        this(name,description);
        this.isFinished = isFinished;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isFinished=" + isFinished +
                '}';
    }
}
