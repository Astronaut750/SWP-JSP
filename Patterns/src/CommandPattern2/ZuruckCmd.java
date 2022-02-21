package CommandPattern2;

public class ZuruckCmd implements Command {
    Bohrer obj;
    private int mm;

    public ZuruckCmd(Bohrer obj, int mm) {
        super();
        this.obj = obj;
        this.mm = mm;
    }

    @Override
    public void execute() {
        obj.zuruck(mm);
    }

    @Override
    public void undo() {
        obj.vor(mm);
    }
}
