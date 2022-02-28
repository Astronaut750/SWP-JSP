package DecoratorPattern2;

public class Felge implements IFelge {
    @Override
    public String getName() {
        return "Felge ";
    }

    @Override
    public double getZoll() {
        return 0;
    }
}
