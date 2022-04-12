import java.util.Scanner;

/**
 * @author Pietro Delfino
 * programma calcolatrice redatto dallo studente
 * somma, differenza, prodotto, divisione
 * definisci le variabili con
 *
 *
 *
 *
 * **/


public class Miacalcolatrice {

        //nel public static void main viene messo il codice che vogliamo eseguire
    public static void main(String[] args) {
        //definisco le variabili che andrò ad utilizzare

        int primoNumero;
        int secondoNumero;
        int risultato;

        //di seguito definisco l'oggetto inputUtente che contiene la funzione scanner per
        //acquisire i numeri inseriti dalla tastiera

        Scanner inputUtente = new Scanner(System.in);
        System.out.println("inserisci il primo numero");
        //qui gestisco l'inserimento del primo numero richiamando
        //l'oggetto primonumero che contiene l'oggetto inpututente con la funzione nextint
        primoNumero = inputUtente.nextInt();
        System.out.println("inserisci il secondo numero");
        secondoNumero = inputUtente.nextInt();

        System.out.println("\t***scegli una delle operazioni disponibili:\n" +
                "1) SOMMA\n" +
                "2) DIFFERENZA\n" +
                "3) PRODOTTO\n" +
                "4) DIVISIONE\n");

        System.out.println("scegli l'operazione da eseguire");
        int operatore = inputUtente.nextInt();
        if (operatore == 1) {
            risultato = primoNumero + secondoNumero;
            System.out.println("la somma dei due numeri è uguale a: " + risultato);
        } else if (operatore == 2) {
            risultato = primoNumero - secondoNumero;
            System.out.println("la differenza tra i due numeri è uguale a:" + risultato);
        } else if (operatore == 3) {
            risultato = primoNumero * secondoNumero;
            System.out.println("il prodotto tra i due numeri è:" + risultato);
        } else if (operatore == 4)
        {
            if (secondoNumero != 0) {
                risultato = primoNumero / secondoNumero;
                System.out.println("la divione tra i due numeri è uguale a: " + risultato);
            } else

                System.out.println("non è possibile dividere un numero per zero!");

        }
    }
}
