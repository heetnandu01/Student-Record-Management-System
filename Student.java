public class Student {

    private int rollNo;
    private String name;
    private int marks;
    
    private double average;
    private String grade;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

        calculateResult(); 
    }

    public int getRollno() { return rollNo; }
    public String getName() { return name; }
    public int getMarks() { return marks; }
    public double getAverage() { return average; }
    public String getGrade() { return grade; }

    public void setName(String name) { this.name = name; }
    public void setMarks(int marks) { 
        this.marks = marks; 
        calculateResult();
    }

    private void calculateResult() {
        this.average = marks; 
        if (average >= 80) grade = "A";
        else if (average >= 60) grade = "B";
        else if (average >= 40) grade = "C";
        else grade = "F";
    }

    public String toString() {
        return rollNo + " : " + name + " : " + marks + " : " + grade;
    }
}
