package problem6;

public class Carpenter implements Person {
    private String name;

    public Carpenter(String name) { this.name = name; }

    public void display() {
        System.out.println("I am " + this.name + " the Carpenter");
    }
}
