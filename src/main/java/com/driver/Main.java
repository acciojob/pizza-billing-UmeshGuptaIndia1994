// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        DeluxePizza dp = new DeluxePizza(true);
        System.out.println(dp.getPrice());
        dp.addTakeaway();
        dp.addExtraCheese();
        dp.addTakeaway();
        System.out.println(dp.getBill());

        Pizza p = new Pizza(false);
        p.addExtraCheese();
        p.addExtraToppings();
        System.out.println(p.getBill());
    }
}
