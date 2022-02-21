package CommandPattern;

public class Main {
    public static void main(String[] args) {

        WebRequest web = new WebRequest();

        GetRequestCommand c1 = new GetRequestCommand(web, "Seite1");
        GetRequestCommand c2 = new GetRequestCommand(web, "Seite2");
        GetRequestCommand c3 = new GetRequestCommand(web, "Seite3");

        CommandRecorder cmdRec = new CommandRecorder();
        cmdRec.execute(c1);
        cmdRec.execute(c2);
        cmdRec.undo();
        cmdRec.redo();


    }
}
