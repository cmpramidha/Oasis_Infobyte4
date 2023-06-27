import java.util.Scanner;

public class QuizApp {
    private static String username;
    private static String password;
    private static boolean isLoggedIn;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        isLoggedIn = false;

        while (true) {
            System.out.println("Welcome to the Quiz App!");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    login(scanner);
                    if (isLoggedIn) {
                        displayMainMenu(scanner);
                        isLoggedIn = false;
                    }
                    break;
                case 2:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.\n");
                    break;
            }
        }
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        // Authenticate the user (e.g., validate against a database)
        if (enteredUsername.equals("admin") && enteredPassword.equals("password")) {
            System.out.println("Login successful!");
            isLoggedIn = true;
            username = enteredUsername;
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static void displayMainMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Update Profile and Password");
            System.out.println("2. Select answers for MCQs");
            System.out.println("3. Timer and auto submit");
            System.out.println("4. Close session and Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    updateProfileAndPassword(scanner);
                    break;
                case 2:
                    selectMCQAnswers(scanner);
                    break;
                case 3:
                    timerAndAutoSubmit();
                    break;
                case 4:
                    System.out.println("Closing session and logging out...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.\n");
                    break;
            }
        }
    }

    private static void updateProfileAndPassword(Scanner scanner) {
        System.out.println("\nUpdate Profile and Password");
        System.out.println("1. Update Profile");
        System.out.println("2. Change Password");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                // Code to update profile
                System.out.println("Profile updated successfully!");
                break;
            case 2:
                // Code to change password
                System.out.println("Password changed successfully!");
                break;
            default:
                System.out.println("Invalid choice! Please try again.\n");
                break;
        }
    }

    private static void selectMCQAnswers(Scanner scanner) {
        System.out.println("\nSelect answers for MCQs");
        // Code to display MCQ questions and get user's answers
        System.out.println("Answers submitted successfully!");
    }

    private static void timerAndAutoSubmit() {
        System.out.println("\nTimer and auto submit");
        // Code to implement timer and auto submit functionality
        System.out.println("Quiz submitted automatically!");
    }
}
