import java.util.HashMap;
import java.util.Map;

public class AcademyManager {
    private Map<Integer, Footballer> footballers;

    public AcademyManager() {

        footballers = new HashMap<>();
    }

    // Registering Footballers
    public void registerFootballer(Footballer f) {
        if (f == null){
            System.out.println("Cannot register null footballer");
            return; // stop execution
        }


        if (footballers.containsKey(f.getId())){
            System.out.println("Registration failed: Footballer with ID " + f.getId() + " already exists.");
            return; // stop execution
        }

        footballers.put(f.getId(), f);
        System.out.println("Footballer registered successfully: " + f.getName());
    }


    // Removing
    public void removeFootballer(int id) {
        if (!footballers.containsKey(id)) {
            System.out.println("Cannot remove: No footballer found with ID " + id);
            return;
        }
        Footballer removed = footballers.remove(id);
        System.out.println("Footballer removed successfully: " + removed.getName());
    }

    // Viewing all footballers
    public void viewFootballers() {
        if (footballers.isEmpty()) {
            System.out.println("No footballers registered in the academy.");
            return;
        }

        System.out.println("Registered Footballers:");
        for (Footballer f : footballers.values()) {
            System.out.println(f);
        }
    }

    // 6. Method to check existence
    public boolean footballerExists(int id) {
        return footballers.containsKey(id);
    }
}

