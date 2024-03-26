import java.util.ArrayList;
import java.util.Scanner;

public class TaskListAppMe {
    public void addTask(ArrayList<String> tasks, Scanner scanner) {
        System.out.print("Enter task to add: ");
        String taskToAdd = scanner.nextLine();
        tasks.add(taskToAdd);
        System.out.println("Task added successfully.");
    }

    public void removeTask(ArrayList<String> tasks, Scanner scanner) {
        if (tasks.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            System.out.println("Select task to remove:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            System.out.print("Enter task number to remove: ");
            int taskNumberToRemove = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            if (taskNumberToRemove > 0 && taskNumberToRemove <= tasks.size()) {
                tasks.remove(taskNumberToRemove - 1);
                System.out.println("Task removed successfully.");
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }

    public void listTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void displayMenu() {
        System.out.println("Task List Application");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. List Tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        TaskListAppMe task = new TaskListAppMe();
        while (true) {
            task.displayMenu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    task.addTask(tasks, scanner);
                    break;
                case 2:
                    task.removeTask(tasks, scanner);
                    break;
                case 3:
                    task.listTasks(tasks);
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
