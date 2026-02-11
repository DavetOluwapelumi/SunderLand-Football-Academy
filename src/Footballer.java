public class Footballer {

    // Fields
    private int id;
    private String name;
    private int age;
    private String position;

    // Constructor
    public Footballer(int id, String name, int age, String position) {

        if (id <= 0) {
            throw new IllegalArgumentException("Footballer ID must be greater than zero.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than zero.");
        }
        if (position == null || position.trim().isEmpty()) {
            throw new IllegalArgumentException("Position cannot be null or empty.");
        }

        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    //setters
    public void setAge(int age) {
        if(age<0){
            throw  new IllegalArgumentException("Age should not be less than zero");
        }
        this.age = age;
    }

    public void setPosition(String position) {
        if (position == null || position.trim().isEmpty()) {
            throw new IllegalArgumentException("Position cannot be null or empty.");
        }
        this.position = position;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    // toString method for displaying footballer details
    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Position: " + position;
    }
}
