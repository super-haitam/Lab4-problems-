package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major() {
        this("23", "Computer Science");
    }

    public Major(String code, String name) {
        this.id = nextId ++;
        this.code = code;
        this.name = name;
        students = new Student[50];
        studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        s.setMajor(this);
        students[studentCount++] = s;
    }

    // Getters
    public int getId() { return this.id; }
    public String getCode() { return this.code; }
    public String getName() { return this.name; }

    // Display all students in the major
    public void displayStudents() {
        for (Student s : students) System.out.println(s);
    }

    public String toString() {
        return String.format("Major[code=%s, name=%s]", code, name);
    }

}
