package CommandPattern2;

public class HebenCmd implements Command {
    private Bohrer obj;

    public HebenCmd(Bohrer obj) {
        super();
        this.obj = obj;
    }

    @Override
    public void execute() {
        obj.heben();
    }

    @Override
    public void undo() {
        obj.senken();
    }
}
