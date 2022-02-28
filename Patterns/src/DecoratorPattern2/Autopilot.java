package DecoratorPattern2;

public class Autopilot implements ITesla {
    ITesla basis;

    public Autopilot(ITesla b) {
        basis = b;
    }

    @Override
    public String getBeschreibung() {
        return basis.getBeschreibung() + " mit autonomer Steuerung";
    }

    @Override
    public double getPrice() {
        return basis.getPrice() + 4000;
    }

    @Override
    public double getGewicht() {
        return basis.getGewicht();
    }

    public Felge getFelge() { return basis.getFelge(); }
}
