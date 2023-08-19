
class Main {
  public static void main(String[] args) {
    Pizza p = new Pizza(true);
    System.out.println(p.getPrice());
    p.addTakeaway();
    p.addExtraCheese();
    p.addTakeaway();
    System.out.println(p.getBill());

    DeluxePizza dp = new DeluxePizza(true);
    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.addTakeaway();
    System.out.println(dp.getBill());
  }
}
