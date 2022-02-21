package CommandPattern2;

public class SenkenCmd implements Command {
    private Bohrer obj;

    public SenkenCmd(Bohrer obj) {
        super();
        this.obj = obj;
    }

    @Override
    public void execute() {
        obj.senken();
    }

    @Override
    public void undo() {
        obj.heben();
    }
}
