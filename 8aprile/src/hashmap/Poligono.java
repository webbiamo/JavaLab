package hashmap;

import java.util.HashMap;
import java.util.Map;

public abstract class Poligono implements MisurePoligono {
     private Map<String, Double> mappaLati = new HashMap<>();

    public Poligono() {   //come da prassi si istanzia prima un costruttore vuoto
    }

    /**
     * Costruttore che istanzia una classe poligono mediatnte un mappa passata come parametro.
     * Questa mappa come chiave/Key (K) ha il nome del lato che vogliamo mappare,
     * mentre come valore ha il vlaore effettivo del lato vero e proprio
     * es: <"base", 22.2>
     * @param mappaLati hashmap dei lati mappati
     *
     * */
    public Poligono(Map<String, Double> mappaLati) {
        this.mappaLati = mappaLati;
    }

    public Map<String, Double> getMappaLati(){
        return mappaLati;
    }

    public void setMappaLati(Map<String, Double> mappaLati)
    {
        this.mappaLati = mappaLati;
    }

    @Override
    public abstract double calcolaArea();

    @Override
    public abstract double calcolaPerimetro();
}
