package CommandPattern2;

public class DrehenLinksCmd implements Command {
    private Bohrer obj;
    private int grad;

    public DrehenLinksCmd(Bohrer obj, int grad) {
        super();
        this.obj = obj;
        this.grad = grad;
    }

    @Override
    public void execute() {
        obj.drehenLinks(grad);
    }

    @Override
    public void undo() {
        obj.drehenRechts(grad);
    }
}
