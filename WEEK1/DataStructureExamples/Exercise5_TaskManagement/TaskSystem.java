/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
class Task {
    String taskId;
    String taskName;
    String status;
    Task next;
    
    public Task(String id, String name, String status) {
        this.taskId = id;
        this.taskName = name;
        this.status = status;
        this.next = null;
    }
    
    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Status: %s", taskId, taskName, status);
    }
}

public class TaskSystem {
    private Task head;
    
    public void addTask(Task task) {
        task.next = head;
        head = task;
        System.out.println("Task added: " + task);
    }
    
    public Task searchTask(String id) {
        Task current = head;
        while (current != null) {
            if (current.taskId.equals(id)) return current;
            current = current.next;
        }
        return null;
    }
    
    public void traverseTasks() {
        System.out.println("Task List:");
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
    
    public void deleteTask(String id) {
        if (head == null) return;
        
        if (head.taskId.equals(id)) {
            System.out.println("Deleting task: " + head);
            head = head.next;
            return;
        }
        
        Task current = head;
        while (current.next != null) {
            if (current.next.taskId.equals(id)) {
                System.out.println("Deleting task: " + current.next);
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found!");
    }
    
    public static void main(String[] args) {
        TaskSystem system = new TaskSystem();
        system.addTask(new Task("T1001", "Implement feature", "In Progress"));
        system.addTask(new Task("T1002", "Fix bug", "Pending"));
        system.traverseTasks();
        system.deleteTask("T1002");
        system.traverseTasks();
    }
}