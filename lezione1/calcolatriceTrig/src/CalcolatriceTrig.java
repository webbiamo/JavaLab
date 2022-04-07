import java.util.Scanner;

/***
 * @author pietro delfino
 * programma come da precedente ma con funzioni e metodo switch
 *
 *
 *
 *
 * ***/




public class CalcolatriceTrig {
    //metodo somma
    public static int somma(int primonumero, int secondonumero) {
        return primonumero + secondonumero;

    }

    //metodo differenza
    public static int differenza(int primonumero, int secondonumero) {
        return primonumero - secondonumero;

    }

    //metodo moltiplicazione
    public static int moltiplicazione(int primonumero, int secondonumero) {
        return primonumero * secondonumero;

    }

    //metodo divisione
    public static int divisione(int primonumero, int secondonumero) {

         return primonumero / secondonumero;

    }

    public static void main(String[] args) {

        int primonumero;
        int secondonumero;
        double angolo;
        char prosegui;

        System.out.println("scegli tra le seguenti operazioni:\n" +
                          "1) somma: \n " +
                          "2) differenza: \n" +
                          "3) moltiplicazione: \n" +
                          "4) divisione : \n" +
                          "5) seno : \n" +
                          "6) tangente : \n"+
                          "7) coseno : \n");

        Scanner inputUtente = new Scanner(System.in);

        System.out.print("Scegli l'operazione da eseguire:\t");
        int operatore = inputUtente.nextInt();

        System.out.println("Inserisci il primo numero:");
        primonumero = inputUtente.nextInt();
        System.out.println("Inserisci il secondo numero:");
        secondonumero = inputUtente.nextInt();

        switch (operatore) {
            case 1: // somma
                System.out.println("Il risultato è: " + somma(primonumero, secondonumero));
                break;
            case 2: // prodotto
                System.out.println("Il risultato è: " + differenza(primonumero, secondonumero));
                break;
            case 3: // moltiplicazione
                System.out.println("Il risultato è: " + moltiplicazione(primonumero, secondonumero));
                break;
            case 4: // divisione
                if (secondonumero != 0) {
                    System.out.println("Il risultato è: " + divisione(primonumero, secondonumero));
                } else {
                    System.out.println("impossibile dividere per zero");
                }
                break;
        }
    }
}