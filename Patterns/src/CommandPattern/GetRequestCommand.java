package CommandPattern;

public class GetRequestCommand implements Command {
    WebRequest obj;
    String url;

    public GetRequestCommand(WebRequest obj, String url) {
        super();
        this.obj = obj;
        this.url = url;
    }

    @Override
    public void execute() {
        obj.getRequest(url);
    }
}