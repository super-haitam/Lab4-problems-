package problem6;

public class Plumber implements Person {
    private String name;

    public Plumber(String name) { this.name = name; }

    public void display() {
        System.out.println("I am " + this.name + " the Plumber");
    }
}
