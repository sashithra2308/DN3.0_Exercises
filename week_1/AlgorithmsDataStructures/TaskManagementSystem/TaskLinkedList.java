package TaskManagementSystem;


public class TaskLinkedList {
    Node head;

    class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    // Add task to the end of the linked list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    // Search for a task by task ID
    public Task searchTask(int taskId) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.task.taskId == taskId) {
                return currentNode.task;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    // Traverse the linked list and print all tasks
    public void traverseTasks() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.task);
            currentNode = currentNode.next;
        }
    }

    // Delete a task by task ID
    public void deleteTask(int taskId) {
        if (head == null) {
            return;
        }
        if (head.task.taskId == taskId) {
            head = head.next;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.task.taskId == taskId) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }
}
