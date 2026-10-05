package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom, nom, telephone, email);
        this.cne = cne;
        this.major = major;
    }

    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(prenom, nom, telephone, email);
        this.cne = cne;
    }

    // Getters


    // Setters
    public void setMajor(Major m) { this.major = m; }

}

