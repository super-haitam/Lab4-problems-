package student;

public class Test {
    public static void main(String[] args) {
        Major engineering = new Major("1", "Engineering");
        Major psychology = new Major("2", "Psychology");
        Major computer_science = new Major();

        Student haitam = new Student(
                "Laghmam", "Haitam", "haitamlaghmam@gmail.com",
                "(+212)121212121", "AE121212", computer_science
        );

        Student youssef = new Student(
                "Ouazzani", "Youssef", "youssefOuazzani@gmail.com",
                "(+212)212121212", "AE212121", computer_science
        );

        Student douaae = new Student(
                "Mabrouk", "Douaae", "douaaemabrouk@gmail.com",
                "(+212)232323232", "AE232323", psychology
        );

        Student anass = new Student(
                "Mahdad", "Anass", "anassmahdad@gmail.com",
                "(+212)343434343", "AE343434", engineering
        );

        System.out.println("The list of students in the computer science major is:");
        computer_science.displayStudents();

        System.out.printf(
                "\nComputer science capacity: %d students\nCurrent enrollment: %d students\nOccupancy rate = %f%%\n",
                50, computer_science.getStudentCount(), computer_science.getOccupancyRate() * 100
        );

        System.out.println("\nEngineering:");
        System.out.println(engineering.getStudentListAsString());

        System.out.println("Psychology:");
        System.out.println(psychology.getStudentListAsString());

        System.out.println("Computer Science:");
        System.out.println(computer_science.getStudentListAsString());

    }
}
