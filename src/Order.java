import java.util.ArrayList;
class Order {
    int id;
    User user;
    ArrayList<String> products;
    static ArrayList<Order> orders = new ArrayList<>();


    public Order(int id, User user, ArrayList<String> products) {
        this.id = id;
        this.user = user;
        this.products = products;
    }
    public String toString() {
        String tmp = "";
        for (String product : products) {
            tmp += product + " ";
        }
        return tmp;
    }
}
