package TaskManagementSystem;

public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskLinkedList = new TaskLinkedList();

        // Create tasks
        Task task1 = new Task(1, "Task 1", "In Progress");
        Task task2 = new Task(2, "Task 2", "Completed");
        Task task3 = new Task(3, "Task 3", "Not Started");

        // Add tasks to the linked list
        taskLinkedList.addTask(task1);
        taskLinkedList.addTask(task2);
        taskLinkedList.addTask(task3);

        // Traverse tasks
        System.out.println("Tasks:");
        taskLinkedList.traverseTasks();

        // Search for a task
        Task searchedTask = taskLinkedList.searchTask(2);
        System.out.println("Searched Task:");
        System.out.println(searchedTask);
    }
}