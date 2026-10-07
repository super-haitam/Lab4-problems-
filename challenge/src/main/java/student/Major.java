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
    public int getStudentCount() { return studentCount; }

    // Display all students in the major
    public void displayStudents() {
        for (Student s : students) if (s != null) System.out.println(s);
    }

    public String toString() {
        return String.format("Major[code=%s, name=%s]", code, name);
    }

    public Student findStudentByCNE(String cne) {
        for (Student s : students) {
            if (s != null) {
                if (s.getCne().equals(cne)) return s;
            }
        }

        return null;
    }

    public boolean removeStudent(String cne) {
        if (findStudentByCNE(cne) == null) return false;

        for (int i = 0; i < studentCount; ++i) {
            Student s = students[i];
            if (s != null && s.getCne().equals(cne)) { students[i] = null; return true; }
        }

        return false;
    }

    public double getOccupancyRate() {
        return (double)studentCount / 50;
    }

    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();
        for (Student s : students) if (s != null) sb.append(s.getFullNameFormatted()).append("\n");
        return sb.toString();
    }
}
