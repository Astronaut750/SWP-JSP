package CommandPattern2;

public class DrehenRechtsCmd implements Command {
    private Bohrer obj;
    private int grad;

    public DrehenRechtsCmd(Bohrer obj, int grad) {
        super();
        this.obj = obj;
        this.grad = grad;
    }

    @Override
    public void execute() {
        obj.drehenRechts(grad);
    }

    @Override
    public void undo() {
        obj.drehenLinks(grad);
    }
}
