package DecoratorPattern2;

public class FelgeArachnid extends Felge {
    @Override
    public String getName() {
        return super.getName() + "Arachnid";
    }

    @Override
    public double getZoll() {
        return 21;
    }
}
