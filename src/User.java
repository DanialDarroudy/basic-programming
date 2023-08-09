import java.util.ArrayList;
import java.util.HashMap;

class User {
    String type;
    String name;
    String password;

    static ArrayList<String> usersName = new ArrayList<>();
    static ArrayList<String> usersPass = new ArrayList<>();
    static HashMap<String, User> users = new HashMap<>();
    ArrayList<Order> ordersOfUser = new ArrayList<>();

    public User(String type, String name, String password) {
        this.type = type;
        this.name = name;
        this.password = password;
    }
     public String toString() {
        return name;
    }
}