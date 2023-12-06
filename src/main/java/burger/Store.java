package burger;

public class Store {

    public static void main(String[] args) {

        Meal regularMeal = new Meal();
        regularMeal.addToppings("ketchup", "Mayo", "Bacon");
        System.out.println(regularMeal);
    }
}
