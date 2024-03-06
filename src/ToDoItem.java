public class ToDoItem {
    private String description;
    private boolean isDone;

    public ToDoItem(String description, boolean isDone) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }
    public boolean isDone() {
        return isDone;
    }

}