package instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;

    public Instructor(String firstName, String secondName, String telephone, String email) {
        super(firstName, secondName, telephone, email);

    }

    public String cleanEmployeeNumber() {
        return this.employeeNumber.trim().replace(" ", "");
    }

    public String toString() {
        return String.format(
                "Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                this.employeeNumber, this.secondName, this.firstName
        );
    }

    public String toCard() {
        StringBuilder sb = new StringBuilder("Instructor\n----------");

        sb.append("\nEmployee #:");     sb.append(employeeNumber);

        sb.append("\nName: ");          sb.append(this.secondName);
                                        sb.append(" ");
                                        sb.append(this.firstName);

        sb.append("\nEmail:");          sb.append(this.email);
        sb.append("\nPhone:");          sb.append(this.phone);

        return sb.append("\n").toString();
    }

    public String displayName() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.secondName);
        if (this.firstName != null) { sb.append(" "); sb.append(this.firstName); }

        return sb.toString();
    }

    // Getters
    public String getFirstName() { return this.firstName; }
    public String getSecondName() { return this.secondName; }
}
