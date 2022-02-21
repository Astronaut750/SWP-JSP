package CommandPattern2;

public class Main {
    public static void main(String[] args) {
        CommandRecorder cmdRec = new CommandRecorder();

        Bohrer b = new Bohrer();
        VorCmd c1 = new VorCmd(b, 20);
        SenkenCmd c2 = new SenkenCmd(b);
        DrehenLinksCmd c3 = new DrehenLinksCmd(b, 30);


        cmdRec.execute(c1);
        cmdRec.undo();

        cmdRec.execute(c2);
        cmdRec.undo();

        cmdRec.execute(c3);
        cmdRec.undo();
    }
}
