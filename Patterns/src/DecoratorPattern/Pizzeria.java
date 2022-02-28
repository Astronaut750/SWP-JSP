package DecoratorPattern;

public class Pizzeria {

    // Factory Method
    static IPizza getMargherita() {
        IPizza p = new PizzaTeig();
        p = new Tomaten(p);
        p = new Käse(p);
        return p;
    }
}
