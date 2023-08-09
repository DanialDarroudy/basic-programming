import java.util.ArrayList;
import java.util.HashMap;

class Storage {
    static HashMap<String , Integer> ingredient = new HashMap<>();

    static void addAllIngredient (int x){
        if (x >= 0) {
            ingredient.put("Flour", x + ingredient.get("Flour"));
            ingredient.put("Cheese", x + ingredient.get("Cheese"));
            ingredient.put("Meat", x + ingredient.get("Meat"));
            ingredient.put("Bread", x + ingredient.get("Bread"));
            ingredient.put("Vegetable", x + ingredient.get("Vegetable"));
            ingredient.put("Chicken", x + ingredient.get("Chicken"));
            ingredient.put("Potato", x + ingredient.get("Potato"));
            ingredient.put("Coffee", x + ingredient.get("Coffee"));
            ingredient.put("Beans", x + ingredient.get("Beans"));
            ingredient.put("Tea", x + ingredient.get("Tea"));
            ingredient.put("Chocolate", x + ingredient.get("Chocolate"));
            ingredient.put("Soda", x + ingredient.get("Soda"));
            ingredient.put("IceCream", x + ingredient.get("IceCream"));
            ingredient.put("Egg", x + ingredient.get("Egg"));
            ingredient.put("Vanilla", x + ingredient.get("Vanilla"));
            ingredient.put("Water", x + ingredient.get("Water"));
            ingredient.put("Sugar", x + ingredient.get("Sugar"));
        }
    }
    static void addIngredient(ArrayList<String> str , ArrayList<Integer> init ){
        for (int i = 0; i < str.size(); i++) {
            if (ingredient.get(str.get(i)) + init.get(i) >= 0) {
                ingredient.put(str.get(i), ingredient.get(str.get(i)) + init.get(i));
            }
            else {
                System.out.println("error : " + str.get(i));
            }
        }
    }
    static boolean checkIngredientC(ArrayList<String> products){
        int init = 0;
        for (String s : products) {
            if (s.equals("Coffee")) {
                if (Storage.ingredient.get("Coffee") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                    init++;
                }
            }
            else if (s.equals("Tea")) {
                if (Storage.ingredient.get("Tea") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                    init++;
                }
            }
            else if (s.equals("HotChocolate")) {
                if (Storage.ingredient.get("Chocolate") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                    init++;
                }
            }
            else if (s.equals("Drink")) {
                if (Storage.ingredient.get("Water") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                    init++;
                }
            }
            else if (s.equals("Water")) {
                if (Storage.ingredient.get("Water") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                    init++;
                }
            }
            else if (s.equals("ChocolateCake")) {
                if (Storage.ingredient.get("Chocolate") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                    init++;
                }
            }
            else if (s.equals("VanillaCake")) {
                if (Storage.ingredient.get("Vanilla") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                    init++;
                }
            }
            else if (s.equals("IceCream")) {
                if (Storage.ingredient.get("IceCream") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                    init++;
                }
            }
            else {
                System.out.println(s + " not available");
            }
        }
        return init == products.size();
    }
    static boolean checkIngredientR(ArrayList<String> products){
        int init = 0;
        for (String s : products) {
            if (s.equals("Pizza")) {
                if (Storage.ingredient.get("Meat") >= 1 && Storage.ingredient.get("Cheese") >= 1) {
                    init++;
                }
            }
            else if (s.equals("Burger")) {
                if (Storage.ingredient.get("Meat") >= 1 && Storage.ingredient.get("Bread") >= 1) {
                    init++;
                }
            }
            else if (s.equals("Steak")) {
                if (Storage.ingredient.get("Meat") >= 1 && Storage.ingredient.get("Chicken") >= 1) {
                    init++;
                }
            }
            else if (s.equals("FriedChicken")) {
                if (Storage.ingredient.get("Potato") >= 1 && Storage.ingredient.get("Chicken") >= 1) {
                    init++;
                }
            }
            else if (s.equals("Salad")) {
                if (Storage.ingredient.get("Vegetable") >= 1 && Storage.ingredient.get("Flour") >= 1) {
                    init++;
                }
            }
            else if (s.equals("FriedPotato")) {
                if (Storage.ingredient.get("Potato") >= 1 && Storage.ingredient.get("Bread") >= 1) {
                    init++;
                }
            }
            else {
                System.out.println(s + " not available");
            }
        }
        return init == products.size();
    }
    static void UpdateIngredient() {
        //Auto Worked
    }
    static void reportIngredient(){
        System.out.println("Flour : " + "" + ingredient.get("Flour"));
        System.out.println("Cheese : " + "" + ingredient.get("Cheese"));
        System.out.println("Meat : " + "" + ingredient.get("Meat"));
        System.out.println("Bread : " + "" + ingredient.get("Bread"));
        System.out.println("Vegetable : " + "" + ingredient.get("Vegetable"));
        System.out.println("Chicken : " + "" + ingredient.get("Chicken"));
        System.out.println("Potato : " + "" + ingredient.get("Potato"));
        System.out.println("Coffee : " + "" + ingredient.get("Coffee"));
        System.out.println("Beans : " + "" + ingredient.get("Beans"));
        System.out.println("Tea : " + "" + ingredient.get("Tea"));
        System.out.println("Chocolate : " + "" + ingredient.get("Chocolate"));
        System.out.println("Soda : " + "" + ingredient.get("Soda"));
        System.out.println("IceCream : " + "" + ingredient.get("IceCream"));
        System.out.println("Egg : " + "" + ingredient.get("Egg"));
        System.out.println("Vanilla : " + "" + ingredient.get("Vanilla"));
        System.out.println("Water : " + "" + ingredient.get("Water"));
        System.out.println("Sugar : " + "" + ingredient.get("Sugar"));
    }
}
