package CommandPattern;

public class WebRequest {
    void getRequest(String url) {
        System.out.println("GET: " + url);
    }

    void postRequest(String url, String params) {
        System.out.println("POST: " + url + " - " + params);
    }
}
