import java.util.Locale;
import java.util.Scanner;

public class Cantina2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // A2
        int nota;

        do {
            System.out.print("Introdu nota (0-10): ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida");
            }

        } while (nota < 0 || nota > 10);

        if (nota < 5) {
            System.out.println("Calificativ: nesatisfacator");
        } else if (nota <= 6) {
            System.out.println("Calificativ: satisfacator");
        } else if (nota <= 8) {
            System.out.println("Calificativ: bine");
        } else {
            System.out.println("Calificativ: excelent");
        }


        // B2

        double pretZeama = 24.50;
        double pretPiure = 46.00;
        double pretSalata = 18.00;
        double pretCompot = 12.00;

        double total = 0;

        int nrZeama = 0;
        int nrPiure = 0;
        int nrSalata = 0;
        int nrCompot = 0;

        int alegere = -1;

        while (alegere != 0) {

            System.out.println();
            System.out.println("===== MENIUL CANTINEI =====");
            System.out.println("1. Zeama de casa     - 24.50 lei");
            System.out.println("2. Piure cu parjoala - 46.00 lei");
            System.out.println("3. Salata de varza   - 18.00 lei");
            System.out.println("4. Compot            - 12.00 lei");
            System.out.println("0. Finalizare comanda");

            System.out.print("Alege produsul: ");
            alegere = sc.nextInt();

            if (alegere == 1) {

                System.out.print("Introdu numarul de portii: ");
                int portii = sc.nextInt();

                total = total + pretZeama * portii;
                nrZeama = nrZeama + portii;

            } else if (alegere == 2) {

                System.out.print("Introdu numarul de portii: ");
                int portii = sc.nextInt();

                total = total + pretPiure * portii;
                nrPiure = nrPiure + portii;

            } else if (alegere == 3) {

                System.out.print("Introdu numarul de portii: ");
                int portii = sc.nextInt();

                total = total + pretSalata * portii;
                nrSalata = nrSalata + portii;

            } else if (alegere == 4) {

                System.out.print("Introdu numarul de portii: ");
                int portii = sc.nextInt();

                total = total + pretCompot * portii;
                nrCompot = nrCompot + portii;

            } else if (alegere != 0) {

                System.out.println("Optiune invalida!");
            }
        }

        double reducere = 0;

        if (total > 100) {
            reducere = total * 0.15;
        }

        double totalFinal = total - reducere;

        System.out.printf("%nTotal acumulat: %.2f lei%n", total);
        System.out.printf("Reducere: %.2f lei%n", reducere);
        System.out.printf("Suma de plata: %.2f lei%n", totalFinal);


        // C2
        System.out.println();
        System.out.println("========== BON DETALIAT ==========");

        if (nrZeama > 0) {
            System.out.printf(
                    "Zeama de casa x %d = %.2f lei%n",
                    nrZeama,
                    nrZeama * pretZeama
            );
        }

        if (nrPiure > 0) {
            System.out.printf(
                    "Piure cu parjoala x %d = %.2f lei%n",
                    nrPiure,
                    nrPiure * pretPiure
            );
        }

        if (nrSalata > 0) {
            System.out.printf(
                    "Salata de varza x %d = %.2f lei%n",
                    nrSalata,
                    nrSalata * pretSalata
            );
        }

        if (nrCompot > 0) {
            System.out.printf(
                    "Compot x %d = %.2f lei%n",
                    nrCompot,
                    nrCompot * pretCompot
            );
        }

        System.out.println("----------------------------------");
        System.out.printf("Subtotal: %.2f lei%n", total);
        System.out.printf("Reducere: %.2f lei%n", reducere);
        System.out.printf("Total: %.2f lei%n", totalFinal);

        sc.close();
    }
}