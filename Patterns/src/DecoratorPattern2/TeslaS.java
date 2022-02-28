package DecoratorPattern2;

public class TeslaS implements ITesla {
    @Override
    public String getBeschreibung() {
        return "Tesla Model S";
    }

    @Override
    public double getPrice() {
        return 90000;
    }

    @Override
    public double getGewicht() {
        return 2000;
    }

    @Override
    public Felge getFelge() {
        return new Felge();
    }
}
