package esempi.astrazione_due;

/**
 * @author Hassan Marji
 * Classe ASTRATTA che andrà a nascondere i miei dettagli implementativi delle classi specializzate (Triangolo
 * Quadrato etc..)
 * Quindi ci dirà cosa faccio, NON COME
 * */
public abstract class Poligono implements MisurePoligono
{
    private Integer numeroLati;

    public Poligono(){}

    public Poligono(Integer numeroLati)
    {
        this.numeroLati = numeroLati;
    }

    public Integer getNumeroLati() {
        return numeroLati;
    }

    public void setNumeroLati(Integer numeroLati) {
        this.numeroLati = numeroLati;
    }

    /**
     * Metodo che andrà a calcolare il perimetro di un determinato poligono
     * @return perimetro, tramite la somma del valore dei lati per il numero di lati
     * */
    public abstract double calcolaPerimetro();

    /**
     * Metodo che andrà a calcolare l'area di un determinato poligono
     * @return area, tramite una determinata formula
     * */
    public abstract double calcolaArea();

    @Override
    public String toString() {
        return "Poligono{" +
                "numeroLati=" + numeroLati +
                '}';
    }
}
