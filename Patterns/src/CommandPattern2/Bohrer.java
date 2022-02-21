package CommandPattern2;

public class Bohrer {
    void vor (int mm) {
        System.out.println("Bohrer vor " + mm + " mm");
    }

    void zuruck(int mm) {
        System.out.println("Bohrer zurück " + mm + " mm");
    }

    void drehenLinks(int grad) {
        System.out.println("Bohrer nach links gedreht um " + grad + " Grad");
    }

    void drehenRechts(int grad) {
        System.out.println("Bohrer nach rechts gedreht um " + grad + " Grad");
    }

    void senken() {
        System.out.println("Bohrer wird gesenkt");
    }

    void heben() {
        System.out.println("Bohrer wird gehoben");
    }
}
