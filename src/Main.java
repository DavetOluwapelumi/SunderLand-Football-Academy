public class Main{
    public static void main(String[] args) {
        AcademyManager academy = new AcademyManager();
        Footballer f1 = new Footballer(1, "David", 20, "Midfielder");
        Footballer f2 = new Footballer(2, "John", 19, "Forward");
        Footballer f3 = new Footballer(3, "Alex", 21, "Defender");

        // Register footballers
        academy.registerFootballer(f1);
        academy.registerFootballer(f2);
        academy.registerFootballer(f3);

        // Attempt duplicate registration
        academy.registerFootballer(f1); // should show error

        // View all footballers
        academy.viewFootballers();

        // Check existence
        System.out.println("Does ID 2 exist? " + academy.footballerExists(2));
        System.out.println("Does ID 4 exist? " + academy.footballerExists(4));

        // Remove a footballer
        academy.removeFootballer(2);

        // Attempt to remove non-existing footballer
        academy.removeFootballer(4);

        // View remaining footballers
        academy.viewFootballers();
    }
}