package DecoratorPattern2;

public class FelgeTempest extends Felge {
    @Override
    public String getName() {
        return super.getName() + "Tempest";
    }

    @Override
    public double getZoll() {
        return 19;
    }
}
