package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        IPizza p = new PizzaTeig();
        p = new Tomaten(p);
        p = new Käse(p);

        IPizza p2 = Pizzeria.getMargherita();

        System.out.println(p.getBeschreibung());
        System.out.println(p.getPrice());

        System.out.println(p2.getBeschreibung());
        System.out.println(p2.getPrice());
    }
}
