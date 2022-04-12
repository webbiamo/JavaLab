


/**
 * @author Pietro Delfino
 * METODI E FUNZIONI 
 * 
 * 
 * 
 */

/**
 * I metodi sono porzioni di codice che viene esguito solo quando richimato.
 * Si possono passaere dati come parametri, in un metodo.
 * Il motivo principale per cui è conveniente utilizzare un metodo è per il
 * fatto
 * che il codice può essere riutilizzato a vantaggio della semplicità di
 * visualizzatione
 * del codice e questo consente di snellire il codice stesso rendendolo al
 * contempo più
 * performante.
 * Per richiamare un metodo di utilizza la sintassi "nomeMetodo();".
 * Nell'esempio seguente "mioMetodo()" viene utilizzato per stampare un testo 
 * (l'azione) quando viene chiamato.
 * 
 **/


 class Metodi {
    
    static void metodo(){
            System.out.println("ciao mi chiamo Pietro");
        }

        public static void main(String[] args) {
           
            metodo();
        }  

}


//a schermo viene stampato "ciao mi chiamo Pietro"