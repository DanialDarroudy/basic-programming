import java.util.ArrayList;

abstract class Product {
    static class Food extends Product {
        static boolean food(ArrayList<String> name) {
            int init = 0;
            for (String s : name) {
                if (s.equals("Pizza")) {
                    if (Storage.ingredient.get("Meat") >= 1 && Storage.ingredient.get("Cheese") >= 1) {
                        Storage.ingredient.put("Meat", Storage.ingredient.get("Meat") - 1);
                        Storage.ingredient.put("Cheese", Storage.ingredient.get("Cheese") - 1);
                        init++;
                    } else {
                        return false;
                    }
                }
                else if (s.equals("Burger")) {
                    if (Storage.ingredient.get("Meat") >= 1 && Storage.ingredient.get("Bread") >= 1) {
                        Storage.ingredient.put("Meat", Storage.ingredient.get("Meat") - 1);
                        Storage.ingredient.put("Bread", Storage.ingredient.get("Bread") - 1);
                        init++;
                    } else {
                        return false;
                    }
                }
                else if (s.equals("Steak")) {
                    if (Storage.ingredient.get("Meat") >= 1 && Storage.ingredient.get("Chicken") >= 1) {
                        Storage.ingredient.put("Meat", Storage.ingredient.get("Meat") - 1);
                        Storage.ingredient.put("Chicken", Storage.ingredient.get("Chicken") - 1);
                        init++;
                    } else {
                        return false;
                    }
                }
                else if (s.equals("FriedChicken")) {
                    if (Storage.ingredient.get("Potato") >= 1 && Storage.ingredient.get("Chicken") >= 1) {
                        Storage.ingredient.put("Potato", Storage.ingredient.get("Potato") - 1);
                        Storage.ingredient.put("Chicken", Storage.ingredient.get("Chicken") - 1);
                        init++;
                    } else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            return name.size() == init;
        }
    }

    static class Juice extends Product {
        static class Hot extends Juice {
            static boolean hot(ArrayList<String> name) {
                int init = 0;
                for (String s : name) {
                    if (s.equals("Coffee")) {
                        if (Storage.ingredient.get("Coffee") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                            Storage.ingredient.put("Coffee", Storage.ingredient.get("Coffee") - 1);
                            Storage.ingredient.put("Sugar", Storage.ingredient.get("Sugar") - 1);
                            init++;
                        } else {
                            return false;
                        }
                    }
                    else if (s.equals("Tea")) {
                        if (Storage.ingredient.get("Tea") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                            Storage.ingredient.put("Tea", Storage.ingredient.get("Tea") - 1);
                            Storage.ingredient.put("Sugar", Storage.ingredient.get("Sugar") - 1);
                            init++;
                        } else {
                            return false;
                        }
                    }
                    else if (s.equals("HotChocolate")) {
                        if (Storage.ingredient.get("Chocolate") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                            Storage.ingredient.put("Chocolate", Storage.ingredient.get("Chocolate") - 1);
                            Storage.ingredient.put("Sugar", Storage.ingredient.get("Sugar") - 1);
                            init++;
                        } else {
                            return false;
                        }
                    }
                    else {
                        return false;
                    }
                }
                return init == name.size();
            }
        }

        static class Cold extends Juice {
            static boolean cold(ArrayList<String> name) {
                int init = 0;
                for (String s : name) {
                    if (s.equals("Drink")) {
                        if (Storage.ingredient.get("Water") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                            Storage.ingredient.put("Water", Storage.ingredient.get("Water") - 1);
                            Storage.ingredient.put("Sugar", Storage.ingredient.get("Sugar") - 1);
                            init++;
                        } else {
                            return false;
                        }
                    }
                    else if (s.equals("Water")) {
                        if (Storage.ingredient.get("Water") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                            Storage.ingredient.put("Water", Storage.ingredient.get("Water") - 1);
                            Storage.ingredient.put("Sugar", Storage.ingredient.get("Sugar") - 1);
                            init++;
                        } else {
                            return false;
                        }
                    }
                    else {
                        return false;
                    }
                }
                return init == name.size();
            }
        }
    }

    static class Dessert extends Product {
        static boolean dessert(ArrayList<String> name) {
            int init = 0;
            for (String s : name) {
                if (s.equals("ChocolateCake")) {
                    if (Storage.ingredient.get("Chocolate") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                        Storage.ingredient.put("Chocolate", Storage.ingredient.get("Chocolate") - 1);
                        Storage.ingredient.put("Sugar", Storage.ingredient.get("Sugar") - 1);
                        init++;
                    } else {
                        return false;
                    }
                }
                else if (s.equals("VanillaCake")) {
                    if (Storage.ingredient.get("Vanilla") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                        Storage.ingredient.put("Vanilla", Storage.ingredient.get("Vanilla") - 1);
                        Storage.ingredient.put("Sugar", Storage.ingredient.get("Sugar") - 1);
                        init++;
                    } else {
                        return false;
                    }
                }
                else if (s.equals("IceCream")) {
                    if (Storage.ingredient.get("IceCream") >= 1 && Storage.ingredient.get("Sugar") >= 1) {
                        Storage.ingredient.put("IceCream", Storage.ingredient.get("IceCream") - 1);
                        Storage.ingredient.put("Sugar", Storage.ingredient.get("Sugar") - 1);
                        init++;
                    } else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            return init == name.size();
        }
    }

    static class Appetizer extends Product {
        static boolean appetizer(ArrayList<String> name) {
            int init = 0;
            for (String s : name) {
                if (s.equals("Salad")) {
                    if (Storage.ingredient.get("Vegetable") >= 1 && Storage.ingredient.get("Flour") >= 1) {
                        Storage.ingredient.put("Vegetable", Storage.ingredient.get("Vegetable") - 1);
                        Storage.ingredient.put("Flour", Storage.ingredient.get("Flour") - 1);
                        init++;
                    } else {
                        return false;
                    }
                } else if (s.equals("FriedPotato")) {
                    if (Storage.ingredient.get("Potato") >= 1 && Storage.ingredient.get("Bread") >= 1) {
                        Storage.ingredient.put("Potato", Storage.ingredient.get("Potato") - 1);
                        Storage.ingredient.put("Bread", Storage.ingredient.get("Bread") - 1);
                        init++;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return init == name.size();
        }
    }
}