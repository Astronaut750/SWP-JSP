package DecoratorPattern;

public class Käse implements IPizza {

    IPizza basis;
    public Käse(IPizza b) {
        basis = b;
    }

    @Override
    public double getPrice() {
        return basis.getPrice() + 1.5;
    }

    @Override
    public String getBeschreibung() {
        return basis.getBeschreibung() + " mit Mozzarella";
    }
}
