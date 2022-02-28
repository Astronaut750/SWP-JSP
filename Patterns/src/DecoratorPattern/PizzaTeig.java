package DecoratorPattern;

public class PizzaTeig implements IPizza {
    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public String getBeschreibung() {
        return "StdTeig";
    }
}
