package CommandPattern2;

public class VorCmd implements Command {
    Bohrer obj;
    private int mm;

    public VorCmd(Bohrer obj, int mm) {
        super();
        this.obj = obj;
        this.mm = mm;
    }

    @Override
    public void execute() {
        obj.vor(mm);
    }

    @Override
    public void undo() {
        obj.zuruck(mm);
    }
}
