package student;

import java.util.Locale;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom, nom, telephone, email);
        this.cne = cne;
        this.major = major;
        this.major.addStudent(this);
    }

    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(prenom, nom, telephone, email, cne, new Major());
    }

    // Getters
    public Major getMajor() { return this.major; }
    public String getCne() { return this.cne; }

    // Setters
    public void setMajor(Major m) { this.major = m; }

    public String toString() {
        return this.cne + " " + this.secondName.toUpperCase() + " " + this.firstName;
    }

    public String getFullNameFormatted() {
        return this.secondName.toUpperCase() + ", " + this.firstName;
    }


}

