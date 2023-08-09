import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Files {
    public static void getIngredients() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./Ingredients.txt"));
            String input = reader.readLine();
            while(input != null) {
                String ingredient = input.split(" ")[0];
                Integer value = Integer.parseInt(input.split(" ")[1]);
                Storage.ingredient.put(ingredient , value);
                input = reader.readLine();
            }
            reader.close();
        }
        catch(Exception e) {
            System.out.println("error");
        }
    }
    public static void getUsers(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./Users.txt"));
            String input = reader.readLine();
            while (input != null) {
                String type = input.split(" ")[0];
                String name = input.split(" ")[1];
                String pass = input.split(" ")[2];
                User user = new User(type, name, pass);
                User.usersName.add(name);
                User.usersPass.add(pass);
                User.users.put(name, user);
                input = reader.readLine();
            }
            reader.close();
        }
        catch(Exception e) {
            System.out.println("Error");
        }
    }
    public static void log (String error) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./log.txt", true));
            writer.write(java.time.LocalDateTime.now() + " - " + error + "\n");
            writer.close();
        }
        catch(Exception e) {
            System.out.println("Error");
        }
    }
}
