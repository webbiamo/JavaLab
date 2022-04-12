package esercizio2;

public class Quadrato extends Poligono
{
    private Double valoreLato; // nel quadrato il valore del lato sarà uguale a tutti

    public Quadrato()
    {}

    public Quadrato(Integer numeroLati, Double valoreLato)
    {
        super(numeroLati);
        this.valoreLato = valoreLato;
    }

    public Double getValoreLato() {
        return valoreLato;
    }

    public void setValoreLato(Double valoreLato) {
        this.valoreLato = valoreLato;
    }

    public Double calcolaArea()
    {
        return Math.pow(this.valoreLato, 2);
    }

    public Double calcolaPerimetro()
    {
        return this.valoreLato * getNumeroLati();
    }

    @Override
    public String toString()
    {
        return "Quadrato{" +
                "valoreLato=" + valoreLato +
                '}';
    }
}
