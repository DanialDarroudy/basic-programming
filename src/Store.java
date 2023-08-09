import java.util.ArrayList;
import java.util.Scanner;

abstract public class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Files.getIngredients();
        Files.getUsers();
        User userCustomer = User.users.get("Mahdi");
        //--//
        ArrayList<String> MahdisOrders1 = new ArrayList<>();
        MahdisOrders1.add("Burger");
        MahdisOrders1.add("Pizza");
        Order orderOfMahdi1 = new Order(1200, userCustomer, MahdisOrders1);
        Order.orders.add(orderOfMahdi1);
        userCustomer.ordersOfUser.add(orderOfMahdi1);
        //--//
        ArrayList<String> MahdisOrders2 = new ArrayList<>();
        MahdisOrders2.add("Water");
        Order orderOfMahdi2 = new Order(1201, userCustomer, MahdisOrders2);
        Order.orders.add(orderOfMahdi2);
        userCustomer.ordersOfUser.add(orderOfMahdi2);
        //--------------------------------------------------------
        System.out.println("Hello WellCome To SharifPlus");
        outer:
        while (true) {
            System.out.println("Please choose one");
            System.out.println("Sign up = 1");
            System.out.println("Log in = 2");
            int init = scanner.nextInt();
            if (init == 1) {
                System.out.println("If you are going to back to previous page , please enter *back* unless enter *-1*");
                String back = scanner.next();
                if (back.equals("back")) {
                    continue outer;
                } else if (back.equals("-1")) {
                    signUp(scanner);
                } else {
                    error();
                }
            } else if (init == 2) {
                System.out.println("If you are going to back to previous page , please enter *back* unless enter *-1*");
                String back = scanner.next();
                if (back.equals("back")) {
                    continue outer;
                } else if (back.equals("-1")) {
                    logIn(scanner);
                } else {
                    error();
                }
            } else {
                System.out.println("If you are going to back to previous page , please enter *back* unless enter *-1*");
                String back = scanner.next();
                if (back.equals("back")) {
                    continue outer;
                } else if (back.equals("-1")) {
                    error();
                } else {
                    error();
                }
            }
        }
    }

    //***********************************************************
    static void signUp(Scanner scanner) {
        flag : while (true) {
            System.out.println("Please enter *logout* to logout and enter *-1* to continue");
            String logout = scanner.next();
            if (logout.equals("logout")) {
                break flag;
            } else {
                inner1:
                while (true) {
                    System.out.println("Please enter your name");
                    String name = scanner.next();
                    while (User.usersName.contains(name)) {
                        System.out.println("Please enter a name that not available");
                        name = scanner.next();
                    }
                    System.out.println("Please enter your password");
                    String password = scanner.next();
                    System.out.println("What is your accessibility?");
                    System.out.println("Customer = 1");
                    System.out.println("Employee = 2");
                    int init = scanner.nextInt();
                    User user;
                    if (init == 1) {
                        System.out.println("If you are going to back to previous page , please enter *back* unless enter *-1*");
                        String back = scanner.next();
                        if (back.equals("back")) {
                            continue inner1;
                        } else if (back.equals("-1")) {
                            user = new User("Customer", name, password);
                            Files.log(user.name + " is SignUp as Customer");
                            User.usersName.add(name);
                            User.usersPass.add(password);
                            User.users.put(name, new User("Customer", name, password));
                            if (customer(scanner , user) == -1) {
                                break flag;
                            }
                        } else {
                            error();
                        }
                    } else if (init == 2) {
                        System.out.println("If you are going to back to previous page , please enter *back* unless enter *-1*");
                        String back = scanner.next();
                        if (back.equals("back")) {
                            continue inner1;
                        } else if (back.equals("-1")) {
                            User user1 = new User("Employee", name, password);
                            Files.log(user1.name + " is SignUp as Employee");
                            User.usersName.add(name);
                            User.usersPass.add(password);
                            User.users.put(name, user1);
                            if (employee(scanner) == -1) {
                                break flag;
                            }
                        } else {
                            error();
                        }
                    } else {
                        System.out.println("If you are going to back to previous page , please enter *back* unless enter *-1*");
                        String back = scanner.next();
                        if (back.equals("back")) {
                            continue inner1;
                        } else if (back.equals("-1")) {
                            error();
                        } else {
                            error();
                        }
                    }
                }
            }
        }
    }

    //**********************************
    static void logIn(Scanner scanner) {
        flag : while (true) {
            System.out.println("Please enter *logout* to logout and enter *-1* to continue");
            String logout = scanner.next();
            if (logout.equals("logout")) {
                break flag;
            } else {
                inner2:
                while (true) {
                    System.out.println("Please enter your name");
                    String name = scanner.next();
                    System.out.println("Please enter your password");
                    String password = scanner.next();
                    System.out.println("What is your accessibility?");
                    System.out.println("Customer = 1");
                    System.out.println("Employee = 2");
                    int init = scanner.nextInt();
                    if (init == 1) {
                        System.out.println("If you are going to back to previous page , please enter *back* unless enter *-1*");
                        String back = scanner.next();
                        if (back.equals("back")) {
                            continue inner2;
                        } else if (back.equals("-1")) {
                            if (User.usersName.contains(name) && User.usersPass.contains(password)) {
                                User user = User.users.get(name);
                                Files.log(user.name + " is Login as Customer");
                                if (customer(scanner , user) == -1) {
                                    break flag;
                                }
                            } else {
                                errorLogIn();
                            }
                        } else {
                            error();
                        }
                    } else if (init == 2) {
                        System.out.println("If you are going to back to previous page , please enter *back* unless enter *-1*");
                        String back = scanner.next();
                        if (back.equals("back")) {
                            continue inner2;
                        } else if (back.equals("-1")) {
                            if (User.usersName.contains(name) && User.usersPass.contains(password)) {
                                User user = User.users.get(name);
                                Files.log(user.name + " is Login as Employee");
                                if (employee(scanner) == -1) {
                                    break flag;
                                }
                            } else {
                                errorLogIn();
                            }
                        } else {
                            error();
                        }
                    } else {
                        System.out.println("If you are going to back to previous page , please enter *back* unless enter *-1*");
                        String back = scanner.next();
                        if (back.equals("back")) {
                            continue inner2;
                        } else if (back.equals("-1")) {
                            error();
                        } else {
                            error();
                        }
                    }
                }
            }
        }
    }
    //***********************************************************
    static void error() {
        System.out.println("Please obey the orders");
    }

    static void errorLogIn() {
        System.out.println("you do not have account");
    }

    //***********************************************************
    static int employee(Scanner scanner) {
        Employee employee = new Employee();
        while (true){
            System.out.println("If you are going to Logout , please enter *logout* unless enter -1");
            String back = scanner.next();
            if (back.equals("logout")) {
                return -1;
            } else {
                System.out.println("What will you do ?");
                System.out.println("viewOrders = 1");
                System.out.println("cancelOrder = 2");
                System.out.println("checkStorage = 3");
                System.out.println("addIngredient = 4");
                System.out.println("addAllIngredient");
                int init = scanner.nextInt();
                if (init == 1) {
                    employee.viewOrders();
                }
                if (init == 2) {
                    System.out.println("Please enter id");
                    int id = scanner.nextInt();
                    employee.cancelOrder(id);
                }
                if (init == 3) {
                    employee.checkStorage();
                }
                if (init == 4) {
                    System.out.println("Please enter the Ingredient and numbers of them and for finish enter -1");
                    ArrayList<String> ingredient = new ArrayList<>();
                    ArrayList<Integer> number = new ArrayList<>();
                    String init1;
                    int init2;
                    while (true) {
                        init1 = scanner.next();
                        if (init1.equals("-1")) {
                            break;
                        }
                        ingredient.add(init1);
                        init2 = scanner.nextInt();
                        if (init2 != -1) {
                            number.add(init2);
                        } else {
                            ingredient.remove(init1);
                            break;
                        }
                    }
                    employee.addIngredient(ingredient, number);
                }
                if (init == 5){
                    int x = scanner.nextInt();
                    employee.addAll(x);
                }
            }
        }
    }

    //-------------------------------------------------------------------
    static class Employee {
        void viewOrders() {
            for (int i = 0; i < Order.orders.size(); i++) {
                System.out.print("id of order : " + Order.orders.get(i).id + " / ");
                System.out.print("user of order : " + Order.orders.get(i).user.name + " / ");
                System.out.println("products of order : " + Order.orders.get(i).products.toString());
            }
        }

        void cancelOrder(int id) {
            int init = 0;
            for (int i = 0; i < Order.orders.size(); i++) {
                if (Order.orders.get(i).id == id) {
                    Files.log("order with id " + Order.orders.get(i).id + " removed");
                    Order.orders.remove(i);
                    init++;
                    break;
                }
            }
            if (init != 1) {
                System.out.println("not available this id");
            }
        }

        void checkStorage() {
            Storage.reportIngredient();
        }

        void addIngredient(ArrayList<String> arr, ArrayList<Integer> add) {
            Storage.addIngredient(arr, add);
            Files.log("Ingredients add");
        }
        void addAll(int x){
            Storage.addAllIngredient(x);
        }
    }

    //****************************************************************************
    static int customer(Scanner scanner, User user) {
        inner3:
        while (true) {
            System.out.println("If you are going to logout , please enter *logout* unless enter -1");
            String back = scanner.next();
            if (back.equals("logout")) {
                return -1;
            } else {
                System.out.println("Where are you going ?");
                System.out.println("Restaurant = 1");
                System.out.println("Cafe = 2");
                System.out.println("History of previous orders = 3");
                int init = scanner.nextInt();
                if (init == 1) {
                    System.out.println("WellCome To Restaurant");
                    Restaurant.getMenu();
                    System.out.println("Please enter products and for finish enter -1");
                    ArrayList<String> products = new ArrayList<>();
                    String init2;
                    while (true) {
                        init2 = scanner.next();
                        if (!init2.equals("-1")) {
                            products.add(init2);
                        } else {
                            break;
                        }
                    }
                    Restaurant.addOrder(products, scanner, user);
                } else if (init == 2) {
                    System.out.println("WellCome To Cafe");
                    Cafe.getMenu();
                    System.out.println("Please enter products and for finish enter -1");
                    ArrayList<String> products = new ArrayList<>();
                    String init2;
                    while (true) {
                        init2 = scanner.next();
                        if (!init2.equals("-1")) {
                            products.add(init2);
                        } else {
                            break;
                        }
                    }
                    Cafe.addOrder(products, scanner, user);
                } else if (init == 3) {
                    for (int i = 0; i < user.ordersOfUser.size(); i++) {
                        System.out.print("id of order : " + user.ordersOfUser.get(i).id + " / ");
                        System.out.print("user of order :" + user.ordersOfUser.get(i).user.name + " / ");
                        System.out.println("products : " + user.ordersOfUser.get(i).products.toString());


                    }
                } else {
                    error();
                }
            }
        }
    }
    //**********************************************************************

    static class Restaurant extends Store {
        static void getMenu() {
            System.out.println("Restaurant:");
            System.out.println("    Food:");
            System.out.print("        Pizza ");
            bool(checkR("Pizza"));
            System.out.print("        Burger ");
            bool(checkR("Burger"));
            System.out.print("        Steak ");
            bool(checkR("Steak"));
            System.out.print("        FriedChicken ");
            bool(checkR("FriedChicken"));
            System.out.println("    Appetizer:");
            System.out.print("        Salad ");
            bool(checkR("Salad"));
            System.out.print("        FriedPotato ");
            bool(checkR("FriedPotato"));
        }

        static void addOrder(ArrayList<String> products, Scanner scanner, User user) {
            System.out.println("Please enter an id for order");
            int id = scanner.nextInt();
            ArrayList<String> food = new ArrayList<>();
            ArrayList<String> appetizer = new ArrayList<>();
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).equals("Pizza")) {
                    food.add(products.get(i));
                } else if (products.get(i).equals("Burger")) {
                    food.add(products.get(i));
                } else if (products.get(i).equals("Steak")) {
                    food.add(products.get(i));
                } else if (products.get(i).equals("FriedChicken")) {
                    food.add(products.get(i));
                } else if (products.get(i).equals("Salad")) {
                    appetizer.add(products.get(i));
                } else if (products.get(i).equals("FriedPotato")) {
                    appetizer.add(products.get(i));
                }
                else {
                    System.out.println("not available");
                }
            }
            if (Product.Food.food(food) && Product.Appetizer.appetizer(appetizer)) {
                Order order = new Order(id, user, products);
                Order.orders.add(order);
                user.ordersOfUser.add(order);
                Files.log("order with id " + order.id + " created");
            }
            else {
                System.out.println("not available");
            }
        }
    }
    static void bool(boolean b){
        if (b){
            System.out.println("available");
        }
        else {
            System.out.println("not available");
        }
    }
    static boolean checkR(String food){
        if (food.equals("Pizza")) {
            if (Storage.ingredient.get("Meat") < 1 || Storage.ingredient.get("Cheese") < 1) {
                return false;
            }
        }
        else if (food.equals("Burger")) {
            if (Storage.ingredient.get("Meat") < 1 || Storage.ingredient.get("Bread") < 1) {
                return false;
            }
        }
        else if (food.equals("Steak")) {
            if (Storage.ingredient.get("Meat") < 1 || Storage.ingredient.get("Chicken") < 1) {
                return false;
            }
        }
        else if (food.equals("FriedChicken")) {
            if (Storage.ingredient.get("Potato") < 1 || Storage.ingredient.get("Chicken") < 1) {
                return false;
            }
        }
        else if (food.equals("Salad")) {
            if (Storage.ingredient.get("Vegetable") < 1 || Storage.ingredient.get("Flour") < 1) {
                return false;
            }
        }
        else if (food.equals("FriedPotato")) {
            if (Storage.ingredient.get("Potato") < 1 || Storage.ingredient.get("Bread") < 1) {
                return false;
            }
        }
        else {
            return false;
        }
        return true;
    }
    static boolean checkC(String food){
        if (food.equals("Coffee")) {
            if (Storage.ingredient.get("Coffee") < 1 || Storage.ingredient.get("Sugar") < 1) {
                return false;
            }
        }
        else if (food.equals("Tea")) {
            if (Storage.ingredient.get("Tea") < 1 || Storage.ingredient.get("Sugar") < 1) {
                return false;
            }
        }
        else if (food.equals("HotChocolate")) {
            if (Storage.ingredient.get("Chocolate") < 1 || Storage.ingredient.get("Sugar") < 1) {
                return false;
            }
        }
        else if (food.equals("Drink")) {
            if (Storage.ingredient.get("Water") < 1 || Storage.ingredient.get("Sugar") < 1) {
                return false;
            }
        }
        else if (food.equals("Water")) {
            if (Storage.ingredient.get("Water") < 1 || Storage.ingredient.get("Sugar") < 1) {
                return false;
            }
        }
        else if (food.equals("ChocolateCake")) {
            if (Storage.ingredient.get("Chocolate") < 1 || Storage.ingredient.get("Sugar") < 1) {
                return false;
            }
        }
        else if (food.equals("VanillaCake")) {
            if (Storage.ingredient.get("Vanilla") < 1 || Storage.ingredient.get("Sugar") < 1) {
                return false;
            }
        }
        else if (food.equals("IceCream")) {
            if (Storage.ingredient.get("IceCream") < 1 || Storage.ingredient.get("Sugar") < 1) {
                return false;
            }
        }
        else {
            return false;
        }
        return true;
    }
    //********************************************************************

    static class Cafe extends Store {
        static void getMenu() {
            System.out.println("Cafe:");
            System.out.println("    juice:");
            System.out.println("        Hot:");
            System.out.print("            Coffee ");
            bool(checkC("Coffee"));
            System.out.print("            Tea ");
            bool(checkC("Tea"));
            System.out.print("            HotChocolate ");
            bool(checkC("HotChocolate"));
            System.out.println("        Cold:");
            System.out.print("            Drink ");
            bool(checkC("Drink"));
            System.out.print("            Water ");
            bool(checkC("Water"));
            System.out.println("    Dessert:");
            System.out.print("        ChocolateCake ");
            bool(checkC("ChocolateCake"));
            System.out.print("        VanillaCake ");
            bool(checkC("VanillaCake"));
            System.out.print("        IceCream ");
            bool(checkC("IceCream"));
        }

        static void addOrder(ArrayList<String> products, Scanner scanner, User user) {
            System.out.println("Please enter an id for order");
            int id = scanner.nextInt();
            ArrayList<String> juiceHot = new ArrayList<>();
            ArrayList<String> juiceCold = new ArrayList<>();
            ArrayList<String> dessert = new ArrayList<>();
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).equals("Coffee")){
                    juiceHot.add(products.get(i));
                }else if (products.get(i).equals("Tea")){
                    juiceHot.add(products.get(i));
                }else if (products.get(i).equals("HotChocolate")){
                    juiceHot.add(products.get(i));
                }else if (products.get(i).equals("Drink")){
                    juiceCold.add(products.get(i));
                }else if (products.get(i).equals("Water")){
                    juiceCold.add(products.get(i));
                }else if (products.get(i).equals("ChocolateCake")){
                    dessert.add(products.get(i));
                }else if (products.get(i).equals("VanillaCake")){
                    dessert.add(products.get(i));
                }else if (products.get(i).equals("IceCream")){
                    dessert.add(products.get(i));
                }
                else {
                    System.out.println("not available");
                }
            }
            if (Product.Juice.Hot.hot(juiceHot) && Product.Juice.Cold.cold(juiceCold) &&
                    Product.Dessert.dessert(dessert)) {
                Order order = new Order(id, user, products);
                Order.orders.add(order);
                user.ordersOfUser.add(order);
                Files.log("order with id " + order.id + " created");
            }
            else {
                System.out.println("not available");
            }
        }
    }
}
