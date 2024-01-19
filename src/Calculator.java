import java.util.Scanner;
public class Calculator {
    private double getal1;
    private double getal2;
    public Calculator() {
        this.getal1 = 0.0;
        this.getal2 = 0.0;
    }
    public Calculator(double getal1, double getal2) {
        this.getal1 = getal1;
        this.getal2 = getal2;
    }
    public double getGetal1() {
        return getal1;
    }
    public void setGetal1(double getal1) {
        this.getal1 = getal1;
    }
    public double getGetal2() {
        return getal2;
    }
    public void setGetal2(double getal2) {
        this.getal2 = getal2;
    }
    public double count(String operation) {
        double result = 0.0;
        switch (operation) {
            case "sum":
                result = getal1 + getal2;
                break;
            case "difference":
                result = getal1 - getal2;
                break;
            case "product":
                result = getal1 * getal2;
                break;
            case "quotiënt":
                if (getal2 != 0) {
                    result = getal1 / getal2;
                } else {
                    System.out.println("Kan niet delen door nul.");
                }
                break;
            default:
                System.out.println("Ongeldige bewerking.");
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.print("Voer het eerste getal in: ");
        double getal1 = scanner.nextDouble();
        System.out.print("Voer het tweede getal in: ");
        double getal2 = scanner.nextDouble();
        System.out.println("Welke bewerkning wil je uitvoeren?");
        System.out.println("sum, difference, product, quotiënt?: ");
        String bewerking = scanner.next();
        c.setGetal1(getal1);
        c.setGetal2(getal2);
        System.out.println(c.count(bewerking));
    }
}
