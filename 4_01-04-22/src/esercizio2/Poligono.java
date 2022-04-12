package esercizio2;

public class Poligono
{
    private Integer numeroLati; //variabile che specifica il numero di lati generale

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

    @Override
    public String toString() {
        return "Poligono{" +
                "numeroLati=" + numeroLati +
                '}';
    }
}
