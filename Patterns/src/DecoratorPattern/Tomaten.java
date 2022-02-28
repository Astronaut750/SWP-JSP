package DecoratorPattern;

public class Tomaten implements IPizza {
    IPizza basis;
    public Tomaten(IPizza b) {
        basis = b;
    }

    @Override
    public double getPrice() {
        return basis.getPrice() + 1.0;
    }

    @Override
    public String getBeschreibung() {
        return basis.getBeschreibung() + " mit Tomaten";
    }
}
