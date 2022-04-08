package arraylist;

import java.util.ArrayList;
import java.util.List;

public class TesterArrayList {
    public static void main(String[] args) {
        List<String> nomiMacchine = new ArrayList<>();//new Arraylist è il costruttore

        nomiMacchine.add("bmw");
        nomiMacchine.add("citroen");
        nomiMacchine.add(  1,  "Fiat");

        for(String macchina : nomiMacchine)
            System.out.println(macchina);

        System.out.println("\n LAMBDA NOTATION ARRAYLIST\n");
        nomiMacchine.forEach(macchina ->{
            System.out.println(macchina);
        });
    }
}
