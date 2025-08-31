import java.util.*;

public class studentDatabase {
    Map<Integer, Student> db = new LinkedHashMap<>();

    void addStudent(int rollNo, String name, int marks) {
        if (db.containsKey(rollNo)) {
            System.out.println("Roll number already exists");
            return;
        }
        Student s = new Student(rollNo, name, marks);
        db.put(rollNo, s);
        System.out.println("Student added");
    }

    void viewAll() {
        if (db.isEmpty()) {
            System.out.println("No students found");
            return;
        } else {
            for (Student s : db.values()) {
                System.out.println(s);
            }
        }
    }

    void searchStudent(int rollNo) {
        if (db.containsKey(rollNo)) {
            Student s = db.get(rollNo);
            System.out.println(s);
        } else {
            System.out.println("Student not found");
        }
    }

    void updateStudent(int rollNo, String newName, int newMarks) {
        if (db.containsKey(rollNo)) {
            Student s = db.get(rollNo);
            s.setName(newName);
            s.setMarks(newMarks);
            System.out.println("Student Updated");
        } else {
            System.out.println("Student not found , can't update");
        }
    }

    void deleteStudent(int rollNo) {
        if (db.containsKey(rollNo)) {
            db.remove(rollNo);
            System.out.println("Student removed Successfully");
        } else {
            System.out.println("Student not found, can't delete");
        }
    }

    void showTopper() {
        if (db.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        List<Student> studentList = new ArrayList<>(db.values());

        studentList.sort((s1, s2) -> s2.getMarks() - s1.getMarks());

        System.out.println("Topper: " + studentList.get(0).getName() + " - Marks: " + studentList.get(0).getMarks()
                + " - Grade: " + studentList.get(0).getGrade());

        System.out.println("\nTop 3 Students:");
        for (int i = 0; i < Math.min(3, studentList.size()); i++) {
            Student s = studentList.get(i);
            System.out
                    .println((i + 1) + ". " + s.getName() + " - Marks: " + s.getMarks() + " - Grade: " + s.getGrade());
        }
    }

    void showStatistics() {
    if (db.isEmpty()) {
        System.out.println("No students found");
        return;
    }

    int totalStudents = db.size();
    int passCount = 0;
    int failCount = 0;
    double totalMarks = 0;

    for (Student s : db.values()) {
        totalMarks += s.getMarks();
        if (!s.getGrade().equals("F")) passCount++;
        else failCount++;
    }

    double classAverage = totalMarks / totalStudents;

    System.out.println("\n🎓📊✨===== Class Performance Report =====✨📊🎓\n");
    System.out.println("👩‍🎓 Total Students    : " + totalStudents);
    System.out.println("🎓 Students Passed     : " + passCount);
    System.out.println("💀 Students Failed     : " + failCount);
    System.out.printf("📈 Class Average Marks : %.2f\n", classAverage);

    System.out.println("\n🎉 Congratulations to all graduates! 🎉");
    System.out.println("🏅 Keep up the great performance! 🏅");
    System.out.println("\n📌===============================📌\n");
}


}
