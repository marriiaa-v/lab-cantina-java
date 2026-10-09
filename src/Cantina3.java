import java.util.Locale;
import java.util.Scanner;

public class Cantina3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // A3

        Produs p1 = new Produs("Zeama de casa", 24.50, 10);
        Produs p2 = new Produs("Piure cu parjoala", 46.00, 8);
        Produs p3 = new Produs("Salata de varza", 18.00, 5);

        System.out.println("===== PRODUSELE DIN CANTINA =====");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


        // B3

        System.out.println();
        System.out.println("===== COMANDA PRODUS =====");

        System.out.print("Introdu denumirea produsului: ");
        String denumireCautata = sc.nextLine();

        System.out.print("Introdu numarul de portii: ");
        int portii = sc.nextInt();

        Produs produsGasit = null;

        if (denumireCautata.equals(p1.getDenumire())) {
            produsGasit = p1;

        } else if (denumireCautata.equals(p2.getDenumire())) {
            produsGasit = p2;

        } else if (denumireCautata.equals(p3.getDenumire())) {
            produsGasit = p3;
        }

        if (produsGasit == null) {

            System.out.println("Produsul solicitat nu exista.");

        } else if (produsGasit.esteDisponibil(portii)) {

            double cost = produsGasit.costPentru(portii);

            System.out.printf(
                    "Produs: %s%n",
                    produsGasit.getDenumire()
            );

            System.out.printf(
                    "Portii: %d%n",
                    portii
            );

            System.out.printf(
                    "Cost: %.2f lei%n",
                    cost
            );

        } else {

            System.out.println("Stoc insuficient.");
        }


        // C3

        System.out.println();
        System.out.println("===== CODURI SCURTE =====");

        System.out.println(p1.getDenumire() + " -> " + p1.codScurt());
        System.out.println(p2.getDenumire() + " -> " + p2.codScurt());
        System.out.println(p3.getDenumire() + " -> " + p3.codScurt());


        sc.close();
    }
}