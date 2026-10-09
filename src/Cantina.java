import java.util.Locale;
import java.util.Scanner;

public class Cantina {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // A1

        System.out.println("===== MENIUL ZILEI =====");
        System.out.println("1. Zeama de casa    - 24.50 lei");
        System.out.println("2. Piure cu parjoala - 46.00 lei");
        System.out.println("3. Salata de varza  - 18.00 lei");
        System.out.println("4. Compot           - 12.00 lei");

        System.out.print("Introdu numarul de portii de zeama: ");
        int nrPortii = sc.nextInt();

        double pretZeama = 24.50;
        double subtotal = pretZeama * nrPortii;

        System.out.println("Cost total: " + subtotal + " lei");


        // B1
        System.out.println();
        System.out.println("===== BON FISCAL =====");

        System.out.print("Introdu numarul de portii de piure cu parjoala: ");
        int portiiPiure = sc.nextInt();

        double pretPiure = 46.00;
        double subtotalB1 = pretPiure * portiiPiure;

        System.out.print("Esti student bursier? (true/false): ");
        boolean bursier = sc.nextBoolean();

        double reducere = 0;

        if (bursier) {
            reducere = subtotalB1 * 0.15;
        }

        double dupaReducere = subtotalB1 - reducere;
        double tva = dupaReducere * 0.20;
        double total = dupaReducere + tva;
        System.out.printf("Subtotal: %.2f lei%n", subtotalB1);
        System.out.printf("Reducere: %.2f lei%n", reducere);
        System.out.printf("TVA: %.2f lei%n", tva);
        System.out.printf("Total: %.2f lei%n", total);


        // C1
        System.out.println();
        System.out.println("===== RESTUL IN BANCNOTE =====");

        System.out.print("Introdu suma de plata: ");
        int sumaPlata = sc.nextInt();

        System.out.print("Introdu suma achitata de client: ");
        int sumaAchitata = sc.nextInt();

        int rest = sumaAchitata - sumaPlata;

        System.out.println("Restul este: " + rest + " lei");

        int bancnote500 = rest / 500;
        rest = rest % 500;

        int bancnote200 = rest / 200;
        rest = rest % 200;

        int bancnote100 = rest / 100;
        rest = rest % 100;

        int bancnote50 = rest / 50;
        rest = rest % 50;

        int bancnote20 = rest / 20;
        rest = rest % 20;

        int bancnote10 = rest / 10;
        rest = rest % 10;

        int bancnote5 = rest / 5;
        rest = rest % 5;

        int bancnote1 = rest / 1;

        System.out.println("500 lei: " + bancnote500);
        System.out.println("200 lei: " + bancnote200);
        System.out.println("100 lei: " + bancnote100);
        System.out.println("50 lei: " + bancnote50);
        System.out.println("20 lei: " + bancnote20);
        System.out.println("10 lei: " + bancnote10);
        System.out.println("5 lei: " + bancnote5);
        System.out.println("1 leu: " + bancnote1);

        sc.close();
    }
}