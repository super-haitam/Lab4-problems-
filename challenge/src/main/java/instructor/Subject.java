package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;

    public Subject(int id, String code, String title) {
        this.id = id;
        this.code = code;
        this.title = title;
    }

    public String normalizedCode() { return code.trim().toUpperCase(); }

    public String properTitle() {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            sb.append(
                    Character.toUpperCase(w.charAt(0))
            ).append(
                    w.substring(1)
            );
        }

        return sb.toString();
    }

    public boolean isIntroCourse() {
        return title.contains("Intro") || code.startsWith("INTRO");
    }

    public String syllabusLine(Instructor instructor) {
        StringBuilder sb = new StringBuilder();

        sb.append(code);
        sb.append(" - ");
        sb.append(title);
        sb.append(" (Instructor: ");
        sb.append(instructor.getSecondName());
        sb.append(" ");
        sb.append(instructor.getFirstName());
        sb.append(")\n");

        return sb.toString();
    }
}
