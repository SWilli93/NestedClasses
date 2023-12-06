package burger;

public class Store {

    public static void main(String[] args) {

        Meal regularMeal = new Meal();
        regularMeal.addToppings("ketchup", "Mayo", "Bacon", "Cheddar");
        System.out.println(regularMeal);
    }
}
