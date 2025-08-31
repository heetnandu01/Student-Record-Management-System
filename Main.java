import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Student Record Management System");
        Scanner sc = new Scanner(System.in);
        studentDatabase db = new studentDatabase();

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Show Topper / Top 3 Students");
            System.out.println("7. Show Class Statistics");
            System.out.println("8. Exit");

            System.out.print("Enter the choice No: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    db.addStudent(roll, name, marks);
                    break;

                case 2:
                    db.viewAll();
                    break;

                case 3:
                    System.out.print("Enter roll to search: ");
                    int searchRoll = sc.nextInt();
                    db.searchStudent(searchRoll);
                    break;

                case 4:
                    System.out.print("Enter roll to update: ");
                    int updateRoll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new marks: ");
                    int newMarks = sc.nextInt();

                    db.updateStudent(updateRoll, newName, newMarks);
                    break;

                case 5:
                    System.out.print("Enter roll to delete: ");
                    int deleteRoll = sc.nextInt();
                    db.deleteStudent(deleteRoll);
                    break;

                case 6:
                    db.showTopper();
                    break;

                case 7:
                    db.showStatistics();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
